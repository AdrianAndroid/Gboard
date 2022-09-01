package defpackage;

import android.util.Log;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* renamed from: owx  reason: default package */
/* loaded from: classes2.dex */
public final class owx implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public owx(obw obwVar, nua nuaVar, nsl nslVar, int i) {
        this.d = i;
        this.c = obwVar;
        this.a = nuaVar;
        this.b = nslVar;
    }

    public owx(owy owyVar, UrlResponseInfo urlResponseInfo, CronetException cronetException, int i) {
        this.d = i;
        this.c = owyVar;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            try {
                Object obj = this.c;
                ((owy) obj).a.onFailed(((owy) obj).d, (UrlResponseInfo) this.a, (CronetException) this.b);
                return;
            } catch (Exception e) {
                Log.e(oxa.a, "Exception in onFailed method", e);
                return;
            }
        }
        Object obj2 = this.c;
        oce oceVar = ((obw) obj2).d;
        if (obj2 != oceVar.r) {
            return;
        }
        oceVar.o((nua) this.a);
        if (this.b == nsl.SHUTDOWN) {
            return;
        }
        ((obw) this.c).d.F.b(2, "Entering {0} state with picker: {1}", this.b, this.a);
        ((obw) this.c).d.o.a((nsl) this.b);
    }
}
