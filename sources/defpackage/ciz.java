package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ciz  reason: default package */
/* loaded from: classes.dex */
public final class ciz implements npe {
    private final /* synthetic */ int a;

    public ciz(int i) {
        this.a = i;
    }

    public static cni b() {
        return new cni();
    }

    public static mkr c() {
        return gxo.a(9);
    }

    public static mkr d() {
        return gxo.a(19);
    }

    public static mks e() {
        mks c = gxo.c(19);
        nxp.X(c);
        return c;
    }

    public static mkr f() {
        return gxo.a(10);
    }

    public static mks g() {
        mks c = gxo.c(10);
        nxp.X(c);
        return c;
    }

    public static mkr h() {
        return gxo.a(6);
    }

    public static idk i() {
        ieh j = ieh.j();
        nxp.X(j);
        return j;
    }

    public static Context j() {
        hsk b = hsx.b();
        if (b == null) {
            throw new IllegalStateException("Input method service is unavailable");
        }
        return b.D();
    }

    public static final cxm k() {
        return new cxm(new cxp(ift.a(), gxo.a(10)), c());
    }

    public static fpp l() {
        return new fpp((byte[]) null);
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        int i;
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                return new hso();
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                throw null;
            case 8:
                return h();
            case 9:
                return i();
            case 10:
                return j();
            case 11:
                throw null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                throw null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new gjz();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new bvq();
            case 15:
                hhl hhlVar = iof.a;
                mhd c = kct.c();
                Object c2 = iof.b.c();
                oll.d(c2, "primesBatteryLoggingEnabled.value");
                c.b(((Boolean) c2).booleanValue());
                return c.a();
            case 16:
                hhl hhlVar2 = iof.a;
                kfj c3 = kfk.c();
                c3.b();
                return c3.a();
            case 17:
                hhl hhlVar3 = iof.a;
                kfp c4 = kfq.c();
                Object c5 = iof.a.c();
                oll.d(c5, "primesMemoryLoggingEnabled.value");
                c4.b(((Boolean) c5).booleanValue());
                return c4.a();
            case 18:
                hhl hhlVar4 = iof.a;
                kgs c6 = kgt.c();
                Object c7 = iof.c.c();
                oll.d(c7, "primesDirStatsLoggingEnabled.value");
                c6.c(((Boolean) c7).booleanValue());
                c6.b();
                kgo kgoVar = new kgo();
                kgoVar.b();
                kgoVar.d = 1;
                kgoVar.c = (byte) (kgoVar.c | 2);
                Object c8 = iof.c.c();
                oll.d(c8, "primesDirStatsLoggingEnabled.value");
                kgoVar.d = true != ((Boolean) c8).booleanValue() ? 2 : 3;
                kgoVar.b();
                kgoVar.a(Pattern.compile("databases/[^/]+"));
                kgoVar.a(Pattern.compile("files/.*"));
                Object obj = kgoVar.e;
                if (obj != null) {
                    kgoVar.b = ((llk) obj).g();
                } else if (kgoVar.b == null) {
                    kgoVar.b = llp.q();
                }
                if (kgoVar.c != 3 || (i = kgoVar.d) == 0) {
                    StringBuilder sb = new StringBuilder();
                    if (kgoVar.d == 0) {
                        sb.append(" enablement");
                    }
                    if ((1 & kgoVar.c) == 0) {
                        sb.append(" maxFolderDepth");
                    }
                    if ((kgoVar.c & 2) == 0) {
                        sb.append(" includeDeviceEncryptedStorage");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                c6.a = lfb.g(new kgp(i, kgoVar.a, kgoVar.b));
                return c6.a();
            case 19:
                hhl hhlVar5 = iof.a;
                kgw c9 = kgx.c();
                c9.b();
                return c9.a();
            default:
                khd c10 = ked.c();
                c10.d(true);
                return c10.c();
        }
    }
}
