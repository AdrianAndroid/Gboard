package defpackage;

import android.view.View;
import java.io.File;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cli  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cli implements leq {
    private final /* synthetic */ int v;
    public static final /* synthetic */ cli u = new cli(20);
    public static final /* synthetic */ cli t = new cli(19);
    public static final /* synthetic */ cli s = new cli(18);
    public static final /* synthetic */ cli r = new cli(17);
    public static final /* synthetic */ cli q = new cli(16);
    public static final /* synthetic */ cli p = new cli(15);
    public static final /* synthetic */ cli o = new cli(14);
    public static final /* synthetic */ cli n = new cli(13);
    public static final /* synthetic */ cli m = new cli(12);
    public static final /* synthetic */ cli l = new cli(11);
    public static final /* synthetic */ cli k = new cli(10);
    public static final /* synthetic */ cli j = new cli(9);
    public static final /* synthetic */ cli i = new cli(8);
    public static final /* synthetic */ cli h = new cli(7);
    public static final /* synthetic */ cli g = new cli(6);
    public static final /* synthetic */ cli f = new cli(5);
    public static final /* synthetic */ cli e = new cli(4);
    public static final /* synthetic */ cli d = new cli(3);
    public static final /* synthetic */ cli c = new cli(2);
    public static final /* synthetic */ cli b = new cli(1);
    public static final /* synthetic */ cli a = new cli(0);

    private /* synthetic */ cli(int i2) {
        this.v = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return cqn.b((byte[]) obj);
            case 1:
                ltg ltgVar = clg.a;
                return ((cqp) obj).d().toString();
            case 2:
                hlk a2 = hln.a();
                a2.e = hlm.CONTEXTUAL;
                a2.d = "6";
                a2.a = (String) obj;
                return a2.a();
            case 3:
                return ((cyn) obj).d();
            case 4:
                return ((crv) obj).a;
            case 5:
                return new cuu((View) obj);
            case 6:
                return coc.c((cob) obj);
            case 7:
                djc a3 = cnz.a();
                a3.b(((cyc) obj).c);
                return a3.a();
            case 8:
                djc a4 = cnz.a();
                a4.b((String) obj);
                return a4.a();
            case 9:
                return new cpm((irh) obj);
            case 10:
                return ((irh) obj).c(0);
            case 11:
                return new cpw((irh) obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new cpw((irh) obj);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((irh) obj).c(0);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(((irh) obj).getInt(1));
            case 15:
                return new cqb((irh) obj);
            case 16:
                return new cqb((irh) obj);
            case 17:
                return ((cqn) cqn.a((File) obj).c(cqn.a)).d;
            case 18:
                cra craVar = (cra) obj;
                ltg ltgVar2 = crf.a;
                if (!craVar.d && craVar.f.e()) {
                    ((cri) craVar.f.a()).h(craVar.a);
                }
                return craVar;
            case 19:
                hhl hhlVar = cuh.a;
                return ((cuf) obj).a;
            default:
                return new cuq(obj);
        }
    }
}
