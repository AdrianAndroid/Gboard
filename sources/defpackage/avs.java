package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* renamed from: avs  reason: default package */
/* loaded from: classes.dex */
public final class avs implements avj {
    private final aze a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public avs(aze azeVar, int i) {
        this.a = azeVar;
        this.b = i;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    @Override // defpackage.avj
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.avj
    public final void d() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        bge.b();
        try {
            aze azeVar = this.a;
            if (azeVar.b == null) {
                azeVar.b = new URL(azeVar.c());
            }
            aviVar.b(e(azeVar.b, 0, null, this.a.d()));
        } catch (IOException e) {
            aviVar.e(e);
        }
    }

    @Override // defpackage.avj
    public final void fh() {
        this.e = true;
    }

    @Override // defpackage.avj
    public final int g() {
        return 2;
    }

    private final InputStream e(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new aup("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new aup("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.b);
            httpURLConnection.setReadTimeout(this.b);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int b = b(this.c);
                int i2 = b / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (!TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = httpURLConnection2.getInputStream();
                        } else {
                            this.d = new bfy(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new aup("Failed to obtain InputStream", b(httpURLConnection2), e);
                    }
                } else if (i2 == 3) {
                    String headerField = this.c.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            d();
                            return e(url3, i + 1, url, map);
                        } catch (MalformedURLException e2) {
                            throw new aup("Bad redirect url: ".concat(String.valueOf(headerField)), b, e2);
                        }
                    }
                    throw new aup("Received empty or null redirect url", b);
                } else {
                    if (b == -1) {
                        throw new aup("Http request failed", -1);
                    }
                    try {
                        throw new aup(this.c.getResponseMessage(), b);
                    } catch (IOException e3) {
                        throw new aup("Failed to get a response message", b, e3);
                    }
                }
            } catch (IOException e4) {
                throw new aup("Failed to connect or obtain data", b(this.c), e4);
            }
        } catch (IOException e5) {
            throw new aup("URL.openConnection threw", 0, e5);
        }
    }
}
