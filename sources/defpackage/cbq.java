package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cbq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cbq implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cbq(cbp cbpVar, int i) {
        this.b = i;
        this.a = cbpVar;
    }

    public /* synthetic */ cbq(cbs cbsVar, int i) {
        this.b = i;
        this.a = cbsVar;
    }

    public cbq(cdi cdiVar, int i) {
        this.b = i;
        this.a = cdiVar;
    }

    public /* synthetic */ cbq(cdv cdvVar, int i) {
        this.b = i;
        this.a = cdvVar;
    }

    public /* synthetic */ cbq(cfz cfzVar, int i) {
        this.b = i;
        this.a = cfzVar;
    }

    public /* synthetic */ cbq(ckq ckqVar, int i) {
        this.b = i;
        this.a = ckqVar;
    }

    public /* synthetic */ cbq(cmn cmnVar, int i) {
        this.b = i;
        this.a = cmnVar;
    }

    public /* synthetic */ cbq(cno cnoVar, int i) {
        this.b = i;
        this.a = cnoVar;
    }

    public /* synthetic */ cbq(cny cnyVar, int i) {
        this.b = i;
        this.a = cnyVar;
    }

    public /* synthetic */ cbq(cpk cpkVar, int i) {
        this.b = i;
        this.a = cpkVar;
    }

    public /* synthetic */ cbq(daz dazVar, int i) {
        this.b = i;
        this.a = dazVar;
    }

    public /* synthetic */ cbq(idn idnVar, int i) {
        this.b = i;
        this.a = idnVar;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [idn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [idn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [idn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [idn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        may mayVar;
        ObjectAnimator ofFloat;
        switch (this.b) {
            case 0:
                ((cbs) this.a).b.c();
                return;
            case 1:
                ((cbp) this.a).c.c();
                return;
            case 2:
                ((cdi) this.a).b.set(false);
                ((gyj) this.a).t();
                return;
            case 3:
                cdv cdvVar = (cdv) this.a;
                if (!cdvVar.f.get() || !cdvVar.g.get() || !cdvVar.c() || !cdv.e()) {
                    return;
                }
                cdvVar.k.execute(new cbq(cdvVar, 4));
                return;
            case 4:
                cdv cdvVar2 = (cdv) this.a;
                List list = (List) cdvVar2.i.get(cdvVar2.m.toString());
                if (list == null || list.size() == 0) {
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                cdvVar2.e.set(cdvVar2.j.loadLanguageIdentifier());
                cdvVar2.l.g(caq.LOAD_LANGUAGE_IDENTIFIER_MODEL, SystemClock.elapsedRealtime() - elapsedRealtime);
                if (!cdvVar2.e.get()) {
                    return;
                }
                cdvVar2.j.setLanguageFilter(list);
                return;
            case 5:
                cfz cfzVar = (cfz) this.a;
                ino M = ino.M(cfzVar.f);
                if (M.al("pref_device_intelligence_onboarding_displayed", false, false)) {
                    return;
                }
                hky a = hlf.a();
                a.p("device_intelligence_onboarding_banner");
                a.m = 1;
                a.s(R.layout.f133990_resource_name_obfuscated_res_0x7f0e006f);
                a.g(cfzVar.f.getString(R.string.f150300_resource_name_obfuscated_res_0x7f14018d));
                a.f(R.id.keyboard_holder);
                a.d = bwe.c;
                a.a = new cfs(cfzVar, 0);
                a.m(0L);
                a.j = new bwt(cfzVar, M, 9);
                a.i = new bxj(cfzVar, 6);
                hkq.b(a.a());
                return;
            case 6:
                cfz cfzVar2 = (cfz) this.a;
                cfzVar2.v();
                cfzVar2.u();
                return;
            case 7:
                ((daz) this.a).d();
                return;
            case 8:
                this.a.a();
                return;
            case 9:
                ckq ckqVar = (ckq) this.a;
                clb clbVar = ckqVar.g;
                opu opuVar = ckqVar.k;
                hjg.q();
                clbVar.e.add(opuVar);
                return;
            case 10:
                ckq ckqVar2 = (ckq) this.a;
                clb clbVar2 = ckqVar2.g;
                opu opuVar2 = ckqVar2.k;
                hjg.q();
                clbVar2.e.remove(opuVar2);
                return;
            case 11:
                this.a.a();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((cmn) this.a).f();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                cmn cmnVar = (cmn) this.a;
                cmnVar.d = true;
                cmnVar.e = true;
                if (cmnVar.n == 2) {
                    cmnVar.m();
                }
                if (cmnVar.n == 2) {
                    mayVar = may.VOICE_INPUT_STARTED_AFTER_EMOJIFIED;
                } else {
                    mayVar = may.VOICE_INPUT_STARTED;
                }
                cmnVar.t(true, true, true, true, mayVar);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                cmn cmnVar2 = (cmn) this.a;
                cmnVar2.e = false;
                if (!((Boolean) cmo.w.c()).booleanValue()) {
                    cmnVar2.r();
                    return;
                }
                hpy b = hqj.b();
                if (b == null) {
                    return;
                }
                cmnVar2.s(b);
                cmnVar2.r();
                return;
            case 15:
                ((cny) this.a).g();
                return;
            case 16:
                Object obj = this.a;
                if (((Boolean) cit.H.c()).booleanValue()) {
                    cny cnyVar = (cny) obj;
                    AnimatorSet animatorSet = cnyVar.l;
                    if (animatorSet != null && animatorSet.isStarted()) {
                        cnyVar.l.cancel();
                    }
                    if (cnyVar.m == null) {
                        cnyVar.m = new AnimatorSet();
                        ValueAnimator ofInt = ValueAnimator.ofInt(cnyVar.d.getHeight(), cnyVar.o);
                        ofInt.addUpdateListener(new op(cnyVar, 5));
                        ofInt.addListener(new cnv(cnyVar));
                        ofInt.setDuration(150L);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cnyVar.e, View.ALPHA, 1.0f, 0.0f);
                        ofFloat2.setDuration(100L);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(ofFloat2, ofInt);
                        animatorSet2.setInterpolator(cny.a);
                        View view = cnyVar.n;
                        if (view == null) {
                            ofFloat = null;
                        } else {
                            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setDuration(100L);
                            ofFloat.addListener(new cnu(cnyVar));
                            ofFloat.setInterpolator(new PathInterpolator(0.1f, 0.9f));
                        }
                        if (ofFloat == null) {
                            cnyVar.m.play(animatorSet2);
                        } else {
                            cnyVar.m.playSequentially(animatorSet2, ofFloat);
                        }
                        cnyVar.m.addListener(new cnt(cnyVar));
                    }
                    if (cnyVar.m.isStarted()) {
                        return;
                    }
                    cnyVar.k(R.raw.f147230_resource_name_obfuscated_res_0x7f130002);
                    cnyVar.b().c();
                    cnyVar.m.start();
                    return;
                }
                ((cny) obj).g();
                return;
            case 17:
                ((cno) this.a).a.g();
                return;
            case 18:
                cpk cpkVar = (cpk) this.a;
                cpkVar.a.measure(View.MeasureSpec.makeMeasureSpec(cpkVar.u.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                return;
            case 19:
                this.a.a();
                return;
            default:
                this.a.a();
                return;
        }
    }
}
