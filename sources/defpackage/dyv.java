package defpackage;

import com.google.android.apps.inputmethod.libs.expression.extension.RichSymbolExtension;
import com.google.android.libraries.inputmethod.backup.BackupAgent;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.chromium.net.CronetProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dyv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dyv implements lfe {
    private final /* synthetic */ int u;
    public static final /* synthetic */ dyv t = new dyv(19);
    public static final /* synthetic */ dyv s = new dyv(18);
    public static final /* synthetic */ dyv r = new dyv(17);
    public static final /* synthetic */ dyv q = new dyv(16);
    public static final /* synthetic */ dyv p = new dyv(15);
    public static final /* synthetic */ dyv o = new dyv(14);
    public static final /* synthetic */ dyv n = new dyv(13);
    public static final /* synthetic */ dyv m = new dyv(12);
    public static final /* synthetic */ dyv l = new dyv(11);
    public static final /* synthetic */ dyv k = new dyv(10);
    public static final /* synthetic */ dyv j = new dyv(9);
    public static final /* synthetic */ dyv i = new dyv(8);
    public static final /* synthetic */ dyv h = new dyv(7);
    public static final /* synthetic */ dyv g = new dyv(6);
    public static final /* synthetic */ dyv f = new dyv(5);
    public static final /* synthetic */ dyv e = new dyv(4);
    public static final /* synthetic */ dyv d = new dyv(3);
    public static final /* synthetic */ dyv c = new dyv(2);
    public static final /* synthetic */ dyv b = new dyv(1);
    public static final /* synthetic */ dyv a = new dyv(0);

    private /* synthetic */ dyv(int i2) {
        this.u = i2;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        joa joaVar;
        joa joaVar2;
        joa joaVar3;
        joa joaVar4;
        switch (this.u) {
            case 0:
                return cuz.a.h() && cuz.a.g(((dyw) obj).h, true);
            case 1:
                return cuz.a.h() && cuz.a.a(((dyw) obj).h, true);
            case 2:
                dyw dywVar = (dyw) obj;
                return cuz.a.e(dywVar.h) && !dywVar.c().X();
            case 3:
                dyw dywVar2 = (dyw) obj;
                int i2 = dyw.i;
                return true;
            case 4:
                ((dyw) obj).d();
                return igr.k(RichSymbolExtension.class);
            case 5:
                dyw dywVar3 = (dyw) obj;
                return cuz.a.k(dywVar3.h) && !dywVar3.c().X();
            case 6:
                return !((cyz) obj).h.e();
            case 7:
                CronetProvider cronetProvider = (CronetProvider) obj;
                return cronetProvider.isEnabled() && !CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName());
            case 8:
                joe joeVar = (joe) obj;
                Pattern pattern = gbx.a;
                return true;
            case 9:
                Pattern pattern2 = gbx.a;
                return ((joe) obj).a == 4;
            case 10:
                joe joeVar2 = (joe) obj;
                Pattern pattern3 = gbx.a;
                if (joeVar2.a == 13) {
                    joaVar = (joa) joeVar2.b;
                } else {
                    joaVar = joa.f;
                }
                return !joaVar.b.isEmpty();
            case 11:
                joe joeVar3 = (joe) obj;
                Pattern pattern4 = gbx.a;
                if (joeVar3.a == 13) {
                    joaVar2 = (joa) joeVar3.b;
                } else {
                    joaVar2 = joa.f;
                }
                return !joaVar2.e.isEmpty();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                joe joeVar4 = (joe) obj;
                Pattern pattern5 = gbx.a;
                if (joeVar4.a == 13) {
                    if (((joa) joeVar4.b).c.isEmpty()) {
                        return true;
                    }
                    if (joeVar4.a == 13) {
                        joaVar3 = (joa) joeVar4.b;
                    } else {
                        joaVar3 = joa.f;
                    }
                    if (joaVar3.e.isEmpty()) {
                        return true;
                    }
                    if (joeVar4.a == 13) {
                        joaVar4 = (joa) joeVar4.b;
                    } else {
                        joaVar4 = joa.f;
                    }
                    if (!joaVar4.b.isEmpty()) {
                        return true;
                    }
                }
                return false;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                gvj gvjVar = (gvj) obj;
                lmz lmzVar = BackupAgent.a;
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                gvj gvjVar2 = (gvj) obj;
                lmz lmzVar2 = BackupAgent.a;
                return true;
            case 15:
                hfw hfwVar = (hfw) obj;
                return hfwVar != null && hfwVar.j;
            case 16:
                ltg ltgVar = hiz.a;
                if (obj == null) {
                    return true;
                }
                if (obj instanceof CharSequence) {
                    if (((CharSequence) obj).length() == 0) {
                        return true;
                    }
                } else if (obj instanceof Iterable) {
                    return lre.ai((Iterable) obj);
                } else {
                    if (obj instanceof Object[]) {
                        if (((Object[]) obj).length == 0) {
                            return true;
                        }
                    } else if (obj instanceof byte[]) {
                        if (((byte[]) obj).length == 0) {
                            return true;
                        }
                    } else if (obj instanceof short[]) {
                        if (((short[]) obj).length == 0) {
                            return true;
                        }
                    } else if (obj instanceof int[]) {
                        if (((int[]) obj).length == 0) {
                            return true;
                        }
                    } else if (obj instanceof long[]) {
                        if (((long[]) obj).length == 0) {
                            return true;
                        }
                    } else if (obj instanceof char[]) {
                        if (((char[]) obj).length == 0) {
                            return true;
                        }
                    } else if (obj instanceof float[]) {
                        if (((float[]) obj).length == 0) {
                            return true;
                        }
                    } else if (obj instanceof double[]) {
                        if (((double[]) obj).length == 0) {
                            return true;
                        }
                    } else if ((obj instanceof boolean[]) && ((boolean[]) obj).length == 0) {
                        return true;
                    }
                }
                return false;
            case 17:
                return Objects.nonNull((hqt) obj);
            case 18:
                Integer num = (Integer) obj;
                jdg.u(num);
                return num.intValue() > 0;
            default:
                int i3 = jwc.a;
                int s2 = lxj.s(((mfm) obj).a);
                return s2 == 0 || s2 != 2;
        }
    }
}
