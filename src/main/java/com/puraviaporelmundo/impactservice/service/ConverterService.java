package com.puraviaporelmundo.impactservice.service;

import com.puraviaporelmundo.impactservice.model.Converter;
import com.puraviaporelmundo.impactservice.utils.URLUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class ConverterService {

    @Autowired
    private CampaignService campaignService;

    @Autowired
    private BitlyService bitlyService;

    public Converter getConvertedUrl(Converter converter) throws UnsupportedEncodingException {
        String trackingUrl = getTrackingUrl();
        converter.setEncodedUrl(URLUtils.encodeUrl(converter.getUrl()));
        converter.setDeepLink(trackingUrl + "&u=" + converter.getEncodedUrl());
        converter.setShortenUrl(getShortenUrl(converter.getDeepLink()));
        return converter;
    }

    private String getTrackingUrl() {
        return campaignService.finById("13416").block().getTrackingLink();
    }

    private String getShortenUrl(String url) {
        return bitlyService.shortenUrl(url).block().getLink();
    }
}
