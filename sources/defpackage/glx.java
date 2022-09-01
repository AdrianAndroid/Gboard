package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: glx  reason: default package */
/* loaded from: classes.dex */
final class glx extends UrlRequest.StatusListener {
    final /* synthetic */ glz a;

    public glx(glz glzVar) {
        this.a = glzVar;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        gme gmeVar = this.a.i;
        if (i == -1) {
            ((ltd) ((ltd) gme.a.d()).k("com/google/android/libraries/gsa/io/impl/TimeoutMonitor", "cronetOnStatus", 182, "TimeoutMonitor.java")).t("Status returned is INVALID. Request (most likely) already terminated.");
        } else if (gmeVar.p == i) {
        } else {
            gmeVar.p = i;
            if (gmeVar.q < i) {
                if (gmeVar.q != -1) {
                    gmeVar.c.e();
                }
                gmeVar.q = i;
            }
            blo bloVar = gmeVar.c;
            int i2 = gmeVar.p;
            int i3 = gmeVar.q;
            blh blhVar = (blh) bloVar;
            blhVar.k = i2;
            blhVar.l = i3;
        }
    }
}
