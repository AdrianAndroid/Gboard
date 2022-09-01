package defpackage;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: oxf  reason: default package */
/* loaded from: classes2.dex */
public final class oxf extends ExperimentalUrlRequest.Builder {
    private static final String a = "oxf";
    private final owi b;
    private final String c;
    private final UrlRequest.Callback d;
    private final Executor e;
    private String f;
    private final ArrayList g = new ArrayList();
    private Collection h;
    private UploadDataProvider i;
    private Executor j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private int o;

    public oxf(String str, UrlRequest.Callback callback, Executor executor, owi owiVar) {
        if (str != null) {
            if (callback == null) {
                throw new NullPointerException("Callback is required.");
            }
            if (executor != null) {
                this.c = str;
                this.d = callback;
                this.e = executor;
                this.b = owiVar;
                return;
            }
            throw new NullPointerException("Executor is required.");
        }
        throw new NullPointerException("URL is required.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: a */
    public final oxe mo95build() {
        oxe a2 = this.b.a(this.c, this.d, this.e, this.k, this.l, this.m, this.n, this.o);
        String str = this.f;
        if (str != null) {
            oxa oxaVar = (oxa) a2;
            oxaVar.c();
            if (!"OPTIONS".equalsIgnoreCase(str) && !"GET".equalsIgnoreCase(str) && !"HEAD".equalsIgnoreCase(str) && !"POST".equalsIgnoreCase(str) && !"PUT".equalsIgnoreCase(str) && !"DELETE".equalsIgnoreCase(str) && !"TRACE".equalsIgnoreCase(str) && !"PATCH".equalsIgnoreCase(str)) {
                throw new IllegalArgumentException("Invalid http method ".concat(str));
            }
            oxaVar.i = str;
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) pair.first;
            String str3 = (String) pair.second;
            oxa oxaVar2 = (oxa) a2;
            oxaVar2.c();
            int i2 = 0;
            while (true) {
                if (i2 < str2.length()) {
                    char charAt = str2.charAt(i2);
                    if (charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}') {
                        switch (charAt) {
                            case '\'':
                            case '(':
                            case ')':
                                break;
                            default:
                                switch (charAt) {
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        break;
                                    default:
                                        switch (charAt) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                                break;
                                            default:
                                                if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                                    i2++;
                                                }
                                                break;
                                        }
                                }
                        }
                    }
                } else if (!str3.contains("\r\n")) {
                    if (oxaVar2.e.containsKey(str2)) {
                        oxaVar2.e.remove(str2);
                    }
                    oxaVar2.e.put(str2, str3);
                }
            }
            throw new IllegalArgumentException("Invalid header " + str2 + "=" + str3);
        }
        UploadDataProvider uploadDataProvider = this.i;
        if (uploadDataProvider != null) {
            Executor executor = this.j;
            oxa oxaVar3 = (oxa) a2;
            if (!oxaVar3.e.containsKey("Content-Type")) {
                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
            }
            oxaVar3.c();
            if (oxaVar3.i == null) {
                oxaVar3.i = "POST";
            }
            oxaVar3.j = new oxj(uploadDataProvider);
            if (oxaVar3.h) {
                oxaVar3.k = executor;
            } else {
                oxaVar3.k = new oxd(executor, 0);
            }
        }
        return a2;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: addHeader */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo93addHeader(String str, String str2) {
        b(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: allowDirectExecutor */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo94allowDirectExecutor() {
        c();
        return this;
    }

    public final void c() {
        this.k = true;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: disableCache */
    public final /* synthetic */ ExperimentalUrlRequest.Builder mo96disableCache() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: disableCache  reason: collision with other method in class */
    public final /* synthetic */ UrlRequest.Builder mo96disableCache() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setHttpMethod */
    public final ExperimentalUrlRequest.Builder mo97setHttpMethod(String str) {
        if (str != null) {
            this.f = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setIdempotency(int i) {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setPriority */
    public final /* synthetic */ ExperimentalUrlRequest.Builder mo98setPriority(int i) {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setPriority  reason: collision with other method in class */
    public final /* synthetic */ UrlRequest.Builder mo98setPriority(int i) {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        this.l = true;
        this.m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        this.n = true;
        this.o = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setUploadDataProvider */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo99setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        d(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: addHeader  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo93addHeader(String str, String str2) {
        b(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: allowDirectExecutor  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo94allowDirectExecutor() {
        c();
        return this;
    }

    public final void d(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider != null) {
            if (executor != null) {
                if (this.f == null) {
                    this.f = "POST";
                }
                this.i = uploadDataProvider;
                this.j = executor;
                return;
            }
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setHttpMethod  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo97setHttpMethod(String str) {
        mo97setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setUploadDataProvider  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo99setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        d(uploadDataProvider, executor);
        return this;
    }

    public final void b(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new NullPointerException("Invalid header value.");
            }
            if ("Accept-Encoding".equalsIgnoreCase(str)) {
                Log.w(a, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
                return;
            } else {
                this.g.add(Pair.create(str, str2));
                return;
            }
        }
        throw new NullPointerException("Invalid header name.");
    }
}
