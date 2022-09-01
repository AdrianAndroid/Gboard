package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oug  reason: default package */
/* loaded from: classes2.dex */
public final class oug extends HttpURLConnection implements opg {
    oqd a;
    opx c;
    boolean d;
    opf e;
    oql h;
    Proxy j;
    opw k;
    private oql m;
    private Throwable n;
    final ouf b = new ouf(this);
    final mlu l = new mlu((byte[]) null);
    long f = -1;
    public final Object g = new Object();
    boolean i = true;

    public oug(URL url, oqd oqdVar) {
        super(url);
        this.a = oqdVar;
    }

    private final opf e() {
        oui ouiVar;
        opf opfVar = this.e;
        if (opfVar != null) {
            return opfVar;
        }
        boolean z = true;
        this.connected = true;
        if (this.doOutput) {
            if (this.method.equals("GET")) {
                this.method = "POST";
            } else if (!oul.h(this.method)) {
                throw new ProtocolException(String.valueOf(this.method).concat(" does not support writing"));
            }
        }
        if (this.l.C("User-Agent") == null) {
            mlu mluVar = this.l;
            String i = oul.i();
            if (i != null) {
                int length = i.length();
                int i2 = 0;
                while (i2 < length) {
                    int codePointAt = i.codePointAt(i2);
                    if (codePointAt > 31 && codePointAt < 127) {
                        i2 += Character.charCount(codePointAt);
                    } else {
                        our ourVar = new our();
                        ourVar.R(i, 0, i2);
                        ourVar.S(63);
                        while (true) {
                            i2 += Character.charCount(codePointAt);
                            if (i2 >= length) {
                                break;
                            }
                            codePointAt = i.codePointAt(i2);
                            ourVar.S((codePointAt <= 31 || codePointAt >= 127) ? 63 : codePointAt);
                        }
                        i = ourVar.n();
                    }
                }
            } else {
                i = "ObsoleteUrlFactory";
            }
            mluVar.I("User-Agent", i);
        }
        if (oul.h(this.method)) {
            if (this.l.C("Content-Type") == null) {
                this.l.I("Content-Type", "application/x-www-form-urlencoded");
            }
            long j = -1;
            if (this.f == -1 && this.chunkLength <= 0) {
                z = false;
            }
            String C = this.l.C("Content-Length");
            long j2 = this.f;
            if (j2 != -1) {
                j = j2;
            } else if (C != null) {
                j = Long.parseLong(C);
            }
            if (z) {
                ouiVar = new ouj(j);
            } else {
                ouiVar = new oud(j);
            }
            ouiVar.c.f(this.a.y, TimeUnit.MILLISECONDS);
        } else {
            ouiVar = null;
        }
        try {
            opz n = opz.n(getURL().toString());
            osr osrVar = new osr((byte[]) null);
            osrVar.c = n;
            osrVar.d(this.l.D());
            osrVar.e(this.method, ouiVar);
            oqi a = osrVar.a();
            oqc a2 = this.a.a();
            a2.e.clear();
            a2.e.add(ouk.a);
            a2.f.clear();
            a2.f.add(this.b);
            a2.a = new opr(this.a.c.a());
            if (!getUseCaches()) {
                a2.i = null;
            }
            oqh g = oqh.g(a2.a(), a);
            this.e = g;
            return g;
        } catch (IllegalArgumentException e) {
            MalformedURLException malformedURLException = new MalformedURLException();
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    private final oql f(boolean z) {
        oql oqlVar;
        synchronized (this.g) {
            oql oqlVar2 = this.m;
            if (oqlVar2 != null) {
                return oqlVar2;
            }
            Throwable th = this.n;
            if (th != null) {
                if (z && (oqlVar = this.h) != null) {
                    return oqlVar;
                }
                throw oul.a(th);
            }
            opf e = e();
            this.b.b();
            oqj oqjVar = ((oqh) e).d.d;
            if (oqjVar != null) {
                ((oui) oqjVar).e.close();
            }
            if (this.d) {
                synchronized (this.g) {
                    while (this.m == null && this.n == null) {
                        try {
                            try {
                                this.g.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        } finally {
                        }
                    }
                }
            } else {
                this.d = true;
                try {
                    b(e.a());
                } catch (IOException e2) {
                    a(e2);
                }
            }
            synchronized (this.g) {
                Throwable th2 = this.n;
                if (th2 == null) {
                    oql oqlVar3 = this.m;
                    if (oqlVar3 == null) {
                        throw new AssertionError();
                    }
                    return oqlVar3;
                }
                throw oul.a(th2);
            }
        }
    }

    @Override // defpackage.opg
    public final void a(IOException iOException) {
        synchronized (this.g) {
            boolean z = iOException instanceof ouk;
            Throwable th = iOException;
            if (z) {
                th = iOException.getCause();
            }
            this.n = th;
            this.g.notifyAll();
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        if (!this.connected) {
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 == null) {
                return;
            }
            this.l.I(str, str2);
            return;
        }
        throw new IllegalStateException("Cannot add request property after connection is made");
    }

    @Override // defpackage.opg
    public final void b(oql oqlVar) {
        synchronized (this.g) {
            this.m = oqlVar;
            this.k = oqlVar.e;
            this.url = oqlVar.a.a.j();
            this.g.notifyAll();
        }
    }

    final opx c() {
        if (this.c == null) {
            oql f = f(true);
            mlu h = f.f.h();
            h.I("ObsoleteUrlFactory-Selected-Protocol", f.b.g);
            h.I("ObsoleteUrlFactory-Response-Source", oul.b(f));
            this.c = h.D();
        }
        return this.c;
    }

    @Override // java.net.URLConnection
    public final void connect() {
        if (this.d) {
            return;
        }
        opf e = e();
        this.d = true;
        e.c(this);
        synchronized (this.g) {
            while (this.i && this.m == null && this.n == null) {
                try {
                    this.g.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            Throwable th = this.n;
            if (th != null) {
                throw oul.a(th);
            }
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.e == null) {
            return;
        }
        this.b.b();
        this.e.b();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.w;
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            oql f = f(true);
            if (oul.g(f) && f.c >= 400) {
                return f.g.d();
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        try {
            opx c = c();
            if (i >= 0 && i < c.a()) {
                return c.d(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        try {
            opx c = c();
            if (i >= 0 && i < c.a()) {
                return c.c(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            return oul.f(c(), oul.c(f(true)));
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        if (!this.doInput) {
            throw new ProtocolException("This protocol does not support input");
        }
        oql f = f(false);
        if (f.c >= 400) {
            throw new FileNotFoundException(this.url.toString());
        }
        return f.g.d();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.u;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        oqj oqjVar = ((oqh) e()).d.d;
        if (oqjVar == null) {
            throw new ProtocolException("method does not support a request body: ".concat(String.valueOf(this.method)));
        }
        if (oqjVar instanceof ouj) {
            connect();
            this.b.b();
        }
        oui ouiVar = (oui) oqjVar;
        if (ouiVar.f) {
            throw new ProtocolException("cannot write request body after response has been read");
        }
        return ouiVar.e;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        URL url = getURL();
        String host = url.getHost();
        int port = url.getPort() != -1 ? url.getPort() : opz.a(url.getProtocol());
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.a.d.address();
            host = inetSocketAddress.getHostName();
            port = inetSocketAddress.getPort();
        }
        return new SocketPermission(host + ":" + port, "connect, resolve");
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.x;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        }
        return oul.f(this.l.D(), null);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.l.C(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return f(true).c;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return f(true).d;
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        oqc a = this.a.a();
        a.b(i, TimeUnit.MILLISECONDS);
        this.a = a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        if (this.ifModifiedSince != 0) {
            this.l.H("If-Modified-Since", ((DateFormat) oul.c.get()).format(new Date(this.ifModifiedSince)));
            return;
        }
        this.l.G("If-Modified-Since");
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        oqc a = this.a.a();
        a.s = z;
        this.a = a.a();
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        oqc a = this.a.a();
        a.c(i, TimeUnit.MILLISECONDS);
        this.a = a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        if (!oul.a.contains(str)) {
            String valueOf = String.valueOf(oul.a);
            throw new ProtocolException("Expected one of " + valueOf + " but was " + str);
        }
        this.method = str;
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        if (!this.connected) {
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 == null) {
                return;
            }
            this.l.H(str, str2);
            return;
        }
        throw new IllegalStateException("Cannot set request property after connection is made");
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        if (this.j != null) {
            return true;
        }
        Proxy proxy = this.a.d;
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Already connected");
        }
        if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (j >= 0) {
            this.f = j;
            ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j, 2147483647L);
            return;
        }
        throw new IllegalArgumentException("contentLength < 0");
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            if (str == null) {
                return oul.c(f(true));
            }
            return c().b(str);
        } catch (IOException unused) {
            return null;
        }
    }
}
