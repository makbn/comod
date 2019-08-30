package io.comod.core.server.swagger;

import springfox.documentation.service.SecurityScheme;
import springfox.documentation.service.VendorExtension;

import java.util.ArrayList;
import java.util.List;

/**
 * Mehdi Akbarian-Rastaghi 5/7/19
 */
public class JWTSecuritySchema extends SecurityScheme {
    private final String keyname;
    private final String passAs;

    public JWTSecuritySchema(String name, String keyname, String passAs) {
        this(name, keyname, passAs, new ArrayList());
    }

    public JWTSecuritySchema(String name, String keyname, String passAs, List<VendorExtension> vendorExtensions) {
        super(name, "http");
        this.keyname = keyname;
        this.passAs = passAs;
        this.addValidVendorExtensions(vendorExtensions);
    }

    public String getKeyname() {
        return this.keyname;
    }

    public String getPassAs() {
        return this.passAs;
    }
}