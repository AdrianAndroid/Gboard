package defpackage;

import android.util.Log;
import java.net.URI;
import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: owt  reason: default package */
/* loaded from: classes2.dex */
public final class owt implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public owt(owy owyVar, UrlResponseInfo urlResponseInfo, int i) {
        this.c = i;
        this.b = owyVar;
        this.a = urlResponseInfo;
    }

    public owt(oxa oxaVar, String str, int i) {
        this.c = i;
        this.b = oxaVar;
        this.a = str;
    }

    public owt(oxa oxaVar, ByteBuffer byteBuffer, int i) {
        this.c = i;
        this.b = oxaVar;
        this.a = byteBuffer;
    }

    public owt(oxa oxaVar, oxb oxbVar, int i) {
        this.c = i;
        this.a = oxaVar;
        this.b = oxbVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [oxb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [oxb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [oxb, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            oxa oxaVar = (oxa) this.b;
            oxaVar.c.execute(oxaVar.a(new owq(this, 3)));
        } else if (i == 1) {
            try {
                this.b.a();
            } catch (Throwable th) {
                ((oxa) this.a).f(th);
            }
        } else if (i == 2) {
            oxa oxaVar2 = (oxa) this.b;
            oxaVar2.p = URI.create(oxaVar2.m).resolve((String) this.a).toString();
            oxa oxaVar3 = (oxa) this.b;
            oxaVar3.f.add(oxaVar3.p);
            ((oxa) this.b).k(2, 3, new owv(this, 3, null));
        } else if (i == 3) {
            try {
                this.b.a();
            } catch (Throwable th2) {
                ((oxa) this.a).e(new owk("System error", th2));
            }
        } else if (i == 4) {
            try {
                this.b.a();
            } catch (Throwable th3) {
                ((oxa) this.a).e(new owh("Exception received from UrlRequest.Callback", th3));
            }
        } else if (i != 5) {
            try {
                Object obj = this.b;
                ((owy) obj).a.onSucceeded(((owy) obj).d, (UrlResponseInfo) this.a);
            } catch (Exception e) {
                Log.e(oxa.a, "Exception in onSucceeded method", e);
            }
        } else {
            try {
                Object obj2 = this.b;
                ((owy) obj2).a.onCanceled(((owy) obj2).d, (UrlResponseInfo) this.a);
            } catch (Exception e2) {
                Log.e(oxa.a, "Exception in onCanceled method", e2);
            }
        }
    }
}
