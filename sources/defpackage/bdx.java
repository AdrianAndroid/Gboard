package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bdx  reason: default package */
/* loaded from: classes.dex */
public final class bdx implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bdx(InputConnection inputConnection, boolean z, int i) {
        this.c = i;
        this.b = inputConnection;
        this.a = z;
    }

    public bdx(bdu bduVar, boolean z, int i) {
        this.c = i;
        this.b = bduVar;
        this.a = z;
    }

    public bdx(bdy bdyVar, boolean z, int i) {
        this.c = i;
        this.b = bdyVar;
        this.a = z;
    }

    public /* synthetic */ bdx(ffn ffnVar, boolean z, int i) {
        this.c = i;
        this.b = ffnVar;
        this.a = z;
    }

    public bdx(ffn ffnVar, boolean z, int i, byte[] bArr) {
        this.c = i;
        this.b = ffnVar;
        this.a = z;
    }

    public /* synthetic */ bdx(hmd hmdVar, boolean z, int i) {
        this.c = i;
        this.b = hmdVar;
        this.a = z;
    }

    public /* synthetic */ bdx(idk idkVar, boolean z, int i) {
        this.c = i;
        this.b = idkVar;
        this.a = z;
    }

    public /* synthetic */ bdx(inq inqVar, boolean z, int i) {
        this.c = i;
        this.b = inqVar;
        this.a = z;
    }

    public bdx(nzx nzxVar, boolean z, int i) {
        this.c = i;
        this.b = nzxVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [idk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        meb mebVar;
        int i = 4;
        switch (this.c) {
            case 0:
                ((bdy) this.b).c.a(this.a);
                return;
            case 1:
                Object obj = this.b;
                boolean z = this.a;
                bgj.j();
                bdv bdvVar = ((bdu) obj).a;
                boolean z2 = bdvVar.a;
                bdvVar.a = z;
                if (z2 == z) {
                    return;
                }
                bdvVar.b.a(z);
                return;
            case 2:
                Object obj2 = this.b;
                boolean z3 = this.a;
                ffn ffnVar = (ffn) obj2;
                if (ffnVar.e.b("voice_promo_notice_diaplay_times", 0) != 1 || ffnVar.c != null) {
                    return;
                }
                ffnVar.c = new bdx(ffnVar, z3, 4, null);
                kki.i(ffnVar.c, 100L);
                return;
            case 3:
                Object obj3 = this.b;
                boolean z4 = this.a;
                fbr.h();
                ((ltd) ((ltd) ffn.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/extension/VoiceImeExtension", "lambda$maybePostNoticeToNoticeManager$5", 261, "VoiceImeExtension.java")).t("send launch-voice-event to input bundle from romanized indic notice");
                ffn ffnVar2 = (ffn) obj3;
                ffnVar2.e.f("has_voice_promo_clicked", true);
                ieh j = ieh.j();
                fbm a = fcn.a(z4);
                Object[] objArr = new Object[1];
                int b = ffnVar2.e.b("voice_promo_notice_diaplay_times", 0);
                if (b == 1) {
                    i = 3;
                } else if (b != 2) {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                j.e(a, objArr);
                return;
            case 4:
                fbr fbrVar = ((ffn) this.b).f;
                final boolean z5 = this.a;
                final Context context = fbrVar.d;
                hky a2 = hlf.a();
                a2.p("voice_promo_banner");
                a2.m = 2;
                a2.s(R.layout.f144810_resource_name_obfuscated_res_0x7f0e0508);
                a2.m(0L);
                a2.g(context.getString(z5 ? R.string.f163170_resource_name_obfuscated_res_0x7f14076a : R.string.f187710_resource_name_obfuscated_res_0x7f141178));
                a2.a = new hle() { // from class: fck
                    @Override // defpackage.hle
                    public final void a(View view) {
                        final Context context2 = context;
                        final boolean z6 = z5;
                        fdz.d(view, "voice_promo_banner");
                        ImageView imageView = (ImageView) view.findViewById(R.id.f130840_resource_name_obfuscated_res_0x7f0b2210);
                        hjq.a(context2).d().h(Integer.valueOf((int) R.drawable.f51260_resource_name_obfuscated_res_0x7f0803c2)).r(imageView);
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: fcl
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                if (r3 != 0) {
                                    fcn.b(context2, z6);
                                } else {
                                    fcn.b(context2, z6);
                                }
                            }
                        });
                        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f130850_resource_name_obfuscated_res_0x7f0b2211);
                        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: fcl
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                if (r3 != 0) {
                                    fcn.b(context2, z6);
                                } else {
                                    fcn.b(context2, z6);
                                }
                            }
                        });
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context2.getApplicationContext(), R.animator.f1010_resource_name_obfuscated_res_0x7f02004f);
                        ((ValueAnimator) loadAnimator).addUpdateListener(new fcm(appCompatTextView, context2.getString(true != z6 ? R.string.f188160_resource_name_obfuscated_res_0x7f1411aa : R.string.f163180_resource_name_obfuscated_res_0x7f14076b), context2.getDrawable(R.drawable.f51190_resource_name_obfuscated_res_0x7f0803bb)));
                        loadAnimator.start();
                    }
                };
                a2.l(R.animator.f500_resource_name_obfuscated_res_0x7f020011);
                a2.e = fcd.c;
                a2.h(R.animator.f490_resource_name_obfuscated_res_0x7f020010);
                a2.f = fcd.c;
                a2.j = new fbq(z5, 2);
                hkq.b(a2.a());
                ((ltd) ((ltd) ffn.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/extension/VoiceImeExtension$4", "run", 350, "VoiceImeExtension.java")).t("romanized indic onboarding banner displayed");
                ffn.f((ffn) this.b);
                return;
            case 5:
                ((hmd) this.b).a.hY(this.a);
                return;
            case 6:
                ?? r0 = this.b;
                boolean z6 = this.a;
                ltg ltgVar = hpr.a;
                hpw.l(r0, z6);
                return;
            case 7:
                Object obj4 = this.b;
                if (!this.a) {
                    inq inqVar = (inq) obj4;
                    Context m = jbt.m(inqVar.a);
                    Context context2 = inqVar.a;
                    m.moveSharedPreferencesFrom(context2, PreferenceManager.getDefaultSharedPreferencesName(context2));
                    PreferenceManager.getDefaultSharedPreferences(m).edit().putBoolean("has_migrated_to_de_storage", true).apply();
                    SharedPreferences b2 = inqVar.b(PreferenceManager.getDefaultSharedPreferences(m), true);
                    if (inqVar.b != null) {
                        inqVar.b.c(b2);
                    }
                }
                inq inqVar2 = (inq) obj4;
                inqVar2.c = true;
                inqVar2.c();
                return;
            case 8:
                ?? r02 = this.b;
                boolean z7 = this.a;
                iqu iquVar = iqu.SC_SHOW_SUGGESTION;
                Object[] objArr2 = new Object[1];
                if (z7) {
                    mebVar = meb.SPELL_CORRECTION;
                } else {
                    mebVar = meb.GRAMMAR_CORRECTION;
                }
                objArr2[0] = mebVar;
                r02.e(iquVar, objArr2);
                return;
            default:
                if (this.a) {
                    oaa oaaVar = ((nzx) this.b).a;
                    oaaVar.p = true;
                    if (oaaVar.m > 0) {
                        lga lgaVar = oaaVar.o;
                        lgaVar.d();
                        lgaVar.e();
                    }
                }
                ((nzx) this.b).a.r = false;
                return;
        }
    }
}
