package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;
import com.google.android.inputmethod.latin.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bsx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bsx implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bsx(View view, Context context, int i) {
        this.c = i;
        this.b = view;
        this.a = context;
    }

    public /* synthetic */ bsx(View view, ino inoVar, int i) {
        this.c = i;
        this.a = view;
        this.b = inoVar;
    }

    public /* synthetic */ bsx(bsy bsyVar, String str, int i) {
        this.c = i;
        this.a = bsyVar;
        this.b = str;
    }

    public /* synthetic */ bsx(bui buiVar, Context context, int i) {
        this.c = i;
        this.b = buiVar;
        this.a = context;
    }

    public /* synthetic */ bsx(cfz cfzVar, String str, int i) {
        this.c = i;
        this.a = cfzVar;
        this.b = str;
    }

    public /* synthetic */ bsx(cjt cjtVar, cjo cjoVar, int i) {
        this.c = i;
        this.b = cjtVar;
        this.a = cjoVar;
    }

    public /* synthetic */ bsx(cny cnyVar, cjo cjoVar, int i) {
        this.c = i;
        this.b = cnyVar;
        this.a = cjoVar;
    }

    public /* synthetic */ bsx(ConstraintHeaderViewImpl constraintHeaderViewImpl, coq coqVar, int i) {
        this.c = i;
        this.a = constraintHeaderViewImpl;
        this.b = coqVar;
    }

    public /* synthetic */ bsx(coy coyVar, coq coqVar, int i) {
        this.c = i;
        this.b = coyVar;
        this.a = coqVar;
    }

    public /* synthetic */ bsx(cut cutVar, Object obj, int i) {
        this.c = i;
        this.a = cutVar;
        this.b = obj;
    }

    public /* synthetic */ bsx(dvx dvxVar, fie fieVar, int i) {
        this.c = i;
        this.a = dvxVar;
        this.b = fieVar;
    }

    public /* synthetic */ bsx(dwd dwdVar, bkj bkjVar, int i) {
        this.c = i;
        this.b = dwdVar;
        this.a = bkjVar;
    }

    public /* synthetic */ bsx(dwe dweVar, dwk dwkVar, int i) {
        this.c = i;
        this.a = dweVar;
        this.b = dwkVar;
    }

    public /* synthetic */ bsx(ebm ebmVar, ebd ebdVar, int i) {
        this.c = i;
        this.b = ebmVar;
        this.a = ebdVar;
    }

    public /* synthetic */ bsx(eel eelVar, edw edwVar, int i) {
        this.c = i;
        this.b = eelVar;
        this.a = edwVar;
    }

    public /* synthetic */ bsx(eem eemVar, edw edwVar, int i) {
        this.c = i;
        this.b = eemVar;
        this.a = edwVar;
    }

    public /* synthetic */ bsx(eiu eiuVar, efx efxVar, int i) {
        this.c = i;
        this.b = eiuVar;
        this.a = efxVar;
    }

    public /* synthetic */ bsx(eiv eivVar, efx efxVar, int i) {
        this.c = i;
        this.b = eivVar;
        this.a = efxVar;
    }

    public /* synthetic */ bsx(eiw eiwVar, ehj ehjVar, int i) {
        this.c = i;
        this.b = eiwVar;
        this.a = ehjVar;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [dwk, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = null;
        switch (this.c) {
            case 0:
                bsy bsyVar = (bsy) this.a;
                String str2 = (String) this.b;
                bsyVar.b.h(str2, bsyVar.b.D(str2) + 1);
                ieh.j().e(bsw.USER_CLICK_NO, new Object[0]);
                hkp.b("auto_translate_banner", true);
                return;
            case 1:
                bsy bsyVar2 = (bsy) this.a;
                bsyVar2.b.h((String) this.b, -1);
                bsyVar2.d();
                hkp.b("auto_translate_banner", true);
                ieh.j().e(bsw.USER_OPT_IN, new Object[0]);
                return;
            case 2:
                Object obj = this.b;
                Object obj2 = this.a;
                bwg.d(view);
                hsk b = hsx.b();
                if (b != null) {
                    b.at(hfd.d(new iay(-10104, null, new icz(((Context) obj2).getString(R.string.f154920_resource_name_obfuscated_res_0x7f14039e), llw.l("activation_source", hfl.CHIP)))));
                }
                ((bui) obj).b.e(bwa.CHIP_EVENT, 2);
                ino.L().f("clipboard_chip_clicked", true);
                return;
            case 3:
                Object obj3 = this.a;
                Object obj4 = this.b;
                bwc.b();
                ((View) obj3).setVisibility(8);
                aia aiaVar = (aia) obj4;
                aiaVar.q(R.string.f160560_resource_name_obfuscated_res_0x7f140655, true);
                aiaVar.q(R.string.f160550_resource_name_obfuscated_res_0x7f140654, true);
                ieh.j().e(bwa.USER_OPT_IN, 7);
                ieh.j().e(bwa.TOP_LEVEL_OPERATION, 6);
                bwg.d(view);
                return;
            case 4:
                Object obj5 = this.b;
                Object obj6 = this.a;
                bwf.b(view, (View) obj5);
                ino.M((Context) obj6).q(R.string.f160980_resource_name_obfuscated_res_0x7f140682, true);
                ieh.j().e(bwa.SCREENSHOT_EVENT, 1);
                return;
            case 5:
                Object obj7 = this.a;
                Object obj8 = this.b;
                hsk b2 = hsx.b();
                if (b2 != null) {
                    b2.at(hfd.d(new iay(-10090, null, 0)));
                }
                cfz cfzVar = (cfz) obj7;
                idk idkVar = cfzVar.g;
                cgd cgdVar = cgd.SUGGESTION_CLICKED;
                Object[] objArr = new Object[3];
                objArr[0] = obj8;
                if ("android:autofill".equals(obj8)) {
                    str = cfzVar.m();
                }
                objArr[1] = str;
                objArr[2] = cfz.r();
                idkVar.e(cgdVar, objArr);
                return;
            case 6:
                Object obj9 = this.b;
                Object obj10 = this.a;
                fgy.j(view);
                cjt cjtVar = (cjt) obj9;
                dau.i(cjtVar.d.a(cjt.b(((cjo) obj10).d().r().equals("bitmoji") ? cjtVar.e : cjtVar.f, dip.i(hfl.EXTERNAL, dba.a))), "Failed to dispatch open sticker tab event");
                cjtVar.d();
                cjtVar.g.e(ciu.IMAGE_CANDIDATE_USAGE, 8);
                return;
            case 7:
                Object obj11 = this.b;
                Object obj12 = this.a;
                fgy.j(view);
                cjt cjtVar2 = (cjt) obj11;
                cjo cjoVar = (cjo) obj12;
                dau.i(cjtVar2.d.a(cjt.b("bitmoji".equals(cjoVar.d().r()) ? cjtVar2.e : cjtVar2.f, dip.j(cjoVar.i(), hfl.EXTERNAL))), "Failed to dispatch open universal tab event");
                cjtVar2.d();
                cjtVar2.g.e(ciu.IMAGE_CANDIDATE_USAGE, 9);
                return;
            case 8:
                Object obj13 = this.b;
                Object obj14 = this.a;
                fgy.j(view);
                cny cnyVar = (cny) obj13;
                cjo cjoVar2 = (cjo) obj14;
                cnyVar.r.q(cjoVar2.d());
                EditorInfo editorInfo = cnyVar.j;
                if (editorInfo == null) {
                    editorInfo = new EditorInfo();
                }
                int d = cnyVar.e.d(view);
                cqz a = cra.a();
                a.a = editorInfo;
                a.b(cjoVar2.d());
                a.e((lfb) cnyVar.h.apply(cjoVar2.d()));
                a.c(d);
                lfb d2 = cny.d(cjoVar2);
                if (d2.e()) {
                    a.c = lfb.g((String) d2.a());
                }
                lfb f = cny.f(cjoVar2);
                if (f.e()) {
                    a.d = lfb.g((String) f.a());
                }
                lfb e = cny.e(cjoVar2);
                if (e.e()) {
                    a.e = lfb.g((String) e.a());
                }
                ((crg) cnyVar.g).a().a(a.a()).g(new bqx(cnyVar, cjoVar2, 4), gyc.b);
                ieh.j().e(ctd.EXPRESSION_MOMENT_CANDIDATE_TYPE_CLICK, Integer.valueOf(cny.a(cjoVar2)));
                cnyVar.k++;
                ieh.j().e(ctd.EXPRESSION_MOMENT_CANDIDATE_OPEN_TO_SHARE_LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - cnyVar.p));
                return;
            case 9:
                ((ConstraintHeaderViewImpl) this.a).l.d((coq) this.b, false);
                return;
            case 10:
                Object obj15 = this.b;
                Object obj16 = this.a;
                cor corVar = ((coy) obj15).s;
                corVar.d.n((coq) obj16, corVar.d.x(cox.b(((mo) obj15).b())));
                return;
            case 11:
                Object obj17 = this.a;
                ((cut) obj17).s.a(this.b, Integer.valueOf(((mo) obj17).b()));
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj18 = this.a;
                Object obj19 = this.b;
                dwh dwhVar = ((dvx) obj18).a;
                bkj bkjVar = ((fie) obj19).a;
                if (bkjVar == null) {
                    bkjVar = bkj.h;
                }
                dwhVar.e(bkjVar);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((dwd) this.b).b.e((bkj) this.a);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj20 = this.a;
                ?? r0 = this.b;
                dwe dweVar = (dwe) obj20;
                dweVar.a.b(dweVar.b);
                r0.j();
                return;
            case 15:
                Object obj21 = this.b;
                ((ebm) obj21).s.a(this.a, Integer.valueOf(((mo) obj21).b()));
                return;
            case 16:
                Object obj22 = this.b;
                ((eel) obj22).s.a(this.a, Integer.valueOf(((mo) obj22).b()));
                return;
            case 17:
                Object obj23 = this.b;
                ((eem) obj23).s.a(this.a, Integer.valueOf(((mo) obj23).b()));
                return;
            case 18:
                Object obj24 = this.b;
                ((eiu) obj24).s.a(this.a, Integer.valueOf(((mo) obj24).b()));
                return;
            case 19:
                Object obj25 = this.b;
                ((eiv) obj25).s.a(this.a, Integer.valueOf(((mo) obj25).b()));
                return;
            default:
                Object obj26 = this.b;
                ((eiw) obj26).s.a(this.a, Integer.valueOf(((mo) obj26).b()));
                return;
        }
    }
}
