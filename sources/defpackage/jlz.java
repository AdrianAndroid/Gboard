package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
import java.util.Random;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jlz  reason: default package */
/* loaded from: classes.dex */
public final class jlz implements npe {
    private final /* synthetic */ int a;
    private final Object b;

    public jlz(jlv jlvVar, int i) {
        this.a = i;
        this.b = jlvVar;
    }

    public jlz(oiy oiyVar, int i) {
        this.a = i;
        this.b = oiyVar;
    }

    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, oiy] */
    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        boolean z = true;
        switch (this.a) {
            case 0:
                return ((jkn) this.b).a();
            case 1:
                return ((jlv) this.b).j;
            case 2:
                return ((jlv) this.b).g;
            case 3:
                return ((jlv) this.b).d;
            case 4:
                jnc jncVar = ((jlv) this.b).a;
                nxp.X(jncVar);
                return jncVar;
            case 5:
                return ((jkq) this.b).a();
            case 6:
                return ((jlv) this.b).e;
            case 7:
                kcq kcqVar = ((jlv) this.b).i;
                nxp.X(kcqVar);
                return kcqVar;
            case 8:
                Objects.requireNonNull((gjz) this.b.a());
                return new jmx(1);
            case 9:
                lfb lfbVar = ((jlv) this.b).c;
                return jlu.a;
            case 10:
                ken kenVar = (ken) ((oiy) ((lfb) ((npf) this.b).b).c(kba.e)).a();
                nxp.X(kenVar);
                return kenVar;
            case 11:
                kdy kdyVar = (kdy) ((oiy) ((lfb) ((npf) this.b).b).c(kba.i)).a();
                nxp.X(kdyVar);
                return kdyVar;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ked kedVar = (ked) ((oiy) ((gmy) this.b).b().c(kba.b)).a();
                nxp.X(kedVar);
                return kedVar;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                kfk kfkVar = (kfk) ((oiy) ((gmy) this.b).b().c(kba.d)).a();
                nxp.X(kfkVar);
                return kfkVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                kgt kgtVar = (kgt) ((oiy) ((gmy) this.b).b().c(kba.c)).a();
                nxp.X(kgtVar);
                return kgtVar;
            case 15:
                lfb lfbVar2 = (lfb) ((npf) this.b).b;
                kbt kbtVar = new kbt(null);
                if (kbtVar.b <= 0) {
                    z = false;
                }
                jdg.H(z, "Thread pool size must be less than or equal to %s", 2);
                return (kbt) lfbVar2.c(kbtVar);
            case 16:
                khb khbVar = (khb) ((oiy) ((lfb) ((npf) this.b).b).c(kba.j)).a();
                nxp.X(khbVar);
                return khbVar;
            case 17:
                kgx kgxVar = (kgx) ((oiy) ((gmy) this.b).b().c(kba.h)).a();
                nxp.X(kgxVar);
                return kgxVar;
            case 18:
                khe kheVar = (khe) ((oiy) ((lfb) ((npf) this.b).b).c(kba.g)).a();
                nxp.X(kheVar);
                return kheVar;
            case 19:
                return new jlr(((lba) this.b).b(), (byte[]) null);
            default:
                gjz gjzVar = (gjz) this.b.a();
                return new Random(SystemClock.elapsedRealtime());
        }
    }
}
