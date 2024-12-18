// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package payload.multipart.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.Configuration;
import payload.multipart.FormDataClient;
import payload.multipart.FormDataHttpPartsClient;
import payload.multipart.FormDataHttpPartsContentTypeClient;
import payload.multipart.FormDataHttpPartsNonStringClient;
import payload.multipart.MultiPartClientBuilder;

class MultiPartClientTestBase extends TestProxyTestBase {
    protected FormDataClient formDataClient;

    protected FormDataHttpPartsClient formDataHttpPartsClient;

    protected FormDataHttpPartsContentTypeClient formDataHttpPartsContentTypeClient;

    protected FormDataHttpPartsNonStringClient formDataHttpPartsNonStringClient;

    @Override
    protected void beforeTest() {
        MultiPartClientBuilder formDataClientbuilder = new MultiPartClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            formDataClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        formDataClient = formDataClientbuilder.buildFormDataClient();

        MultiPartClientBuilder formDataHttpPartsClientbuilder = new MultiPartClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            formDataHttpPartsClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        formDataHttpPartsClient = formDataHttpPartsClientbuilder.buildFormDataHttpPartsClient();

        MultiPartClientBuilder formDataHttpPartsContentTypeClientbuilder = new MultiPartClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            formDataHttpPartsContentTypeClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        formDataHttpPartsContentTypeClient
            = formDataHttpPartsContentTypeClientbuilder.buildFormDataHttpPartsContentTypeClient();

        MultiPartClientBuilder formDataHttpPartsNonStringClientbuilder = new MultiPartClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "http://localhost:3000"))
            .httpClient(getHttpClientOrUsePlayback(getHttpClients().findFirst().orElse(null)))
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.RECORD) {
            formDataHttpPartsNonStringClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        formDataHttpPartsNonStringClient
            = formDataHttpPartsNonStringClientbuilder.buildFormDataHttpPartsNonStringClient();

    }
}
