package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.android.libraries.inputmethod.featuresplit.debugactivity.FeatureSplitDebugActivity;
import com.google.android.libraries.inputmethod.keyboardmode.KeyboardSideFrame;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fat  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fat implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fat(FeatureSplitDebugActivity featureSplitDebugActivity, int i) {
        this.b = i;
        this.a = featureSplitDebugActivity;
    }

    public fat(KeyboardSideFrame keyboardSideFrame, int i) {
        this.b = i;
        this.a = keyboardSideFrame;
    }

    public fat(eyo eyoVar, int i) {
        this.b = i;
        this.a = eyoVar;
    }

    public /* synthetic */ fat(fai faiVar, int i) {
        this.b = i;
        this.a = faiVar;
    }

    public /* synthetic */ fat(fax faxVar, int i) {
        this.b = i;
        this.a = faxVar;
    }

    public /* synthetic */ fat(giq giqVar, int i) {
        this.b = i;
        this.a = giqVar;
    }

    public /* synthetic */ fat(gsh gshVar, int i) {
        this.b = i;
        this.a = gshVar;
    }

    public fat(hbs hbsVar, int i) {
        this.b = i;
        this.a = hbsVar;
    }

    public /* synthetic */ fat(hbw hbwVar, int i) {
        this.b = i;
        this.a = hbwVar;
    }

    public /* synthetic */ fat(hci hciVar, int i) {
        this.b = i;
        this.a = hciVar;
    }

    public fat(hcp hcpVar, int i) {
        this.b = i;
        this.a = hcpVar;
    }

    public /* synthetic */ fat(heo heoVar, int i) {
        this.b = i;
        this.a = heoVar;
    }

    public /* synthetic */ fat(hoe hoeVar, int i) {
        this.b = i;
        this.a = hoeVar;
    }

    public /* synthetic */ fat(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ fat(opu opuVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = opuVar;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [hdi, hdj] */
    /* JADX WARN: Type inference failed for: r0v55, types: [heo, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                fbr.f(view);
                ((dt) obj).dismiss();
                ((fax) obj).c(fbm.VOICE_DONATION_INTRO_DIALOG_NEGATIVE_BUTTON_CLICKED);
                return;
            case 1:
                ((eyo) this.a).a = (String) view.getTag();
                ((eyo) this.a).notifyDataSetChanged();
                Runnable runnable = ((eyo) this.a).b;
                if (runnable == null) {
                    return;
                }
                runnable.run();
                return;
            case 2:
                Object obj2 = this.a;
                fbr.f(view);
                dt dtVar = (dt) obj2;
                dtVar.findViewById(R.id.f130600_resource_name_obfuscated_res_0x7f0b21f7).setVisibility(8);
                dtVar.findViewById(R.id.f130540_resource_name_obfuscated_res_0x7f0b21f1).setVisibility(0);
                dtVar.setTitle(R.string.f187860_resource_name_obfuscated_res_0x7f141187);
                ((fax) obj2).c(fbm.VOICE_DONATION_CONSENT_DIALOG_SHOWN);
                return;
            case 3:
                Object obj3 = this.a;
                fbr.f(view);
                ((dt) obj3).dismiss();
                ((fax) obj3).c(fbm.VOICE_DONATION_CONSENT_DIALOG_NEGATIVE_BUTTON_CLICKED);
                return;
            case 4:
                Object obj4 = this.a;
                fbr.f(view);
                ((dt) obj4).dismiss();
                fax faxVar = (fax) obj4;
                faxVar.c(fbm.VOICE_DONATION_CONSENT_DIALOG_POSITIVE_BUTTON_CLICKED);
                faxVar.a(fae.a(faxVar.getContext(), true));
                return;
            case 5:
                ((opu) this.a).t();
                return;
            case 6:
                ((fai) this.a).b(fbr.b);
                ((ltd) ((ltd) fcj.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoicePermissionKeyboardOverlay", "lambda$setPermissionPromoButton$5", 168, "VoicePermissionKeyboardOverlay.java")).t("Grant Permission button clicked and system dialog shown");
                ieh.j().e(fbm.MIC_PERMISSION_OVERLAY_USAGE, 1);
                hkp.b("permission_promo_overlay", false);
                return;
            case 7:
                hkp.b((String) this.a, false);
                return;
            case 8:
                ((giq) this.a).a.onBackPressed();
                return;
            case 9:
                ((gsh) this.a).b();
                return;
            case 10:
                if (!(view instanceof EmojiView)) {
                    ((ltd) ((ltd) hbs.a.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$3", "onClick", 121, "EmojiListController.java")).w("Clicked view is not EmojiView: %s", view);
                    return;
                }
                EmojiView emojiView = (EmojiView) view;
                ((hbs) this.a).c.e(emojiView.c.b);
                hyq.o(((hbs) this.a).h, icu.n(emojiView.c.b));
                ((hbs) this.a).f.u(emojiView.c);
                ((hbs) this.a).g.hg(emojiView.c.c);
                return;
            case 11:
                ((hbw) this.a).k.run();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj5 = this.a;
                hxk.a(view.getContext()).b(view, 0);
                if (!(view instanceof CustomImageView)) {
                    ((ltd) ((ltd) hci.a.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "lambda$new$0", 355, "EmojiPickerController.java")).w("Clicked view is not CustomImageView: %s", view);
                    return;
                }
                hcg hcgVar = ((hci) obj5).B;
                hgw hgwVar = ((CustomImageView) view).a;
                hcgVar.hx();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((hci) this.a).B.u(((EmojiView) view).c);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (!(view instanceof EmojiView)) {
                    ((ltd) ((ltd) hcp.a.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupViewController$1", "onClick", 79, "EmojiPickerPopupViewController.java")).w("Clicked view is not EmojiView: %s", view);
                    return;
                }
                hxk.a(view.getContext()).b(view, 0);
                View.OnClickListener onClickListener = ((hcp) this.a).c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                PopupWindow popupWindow = ((hcp) this.a).d;
                if (popupWindow == null) {
                    return;
                }
                popupWindow.dismiss();
                return;
            case 15:
                ?? r0 = this.a;
                if (view instanceof EmojiView) {
                    r0.l(((EmojiView) view).c);
                    return;
                } else {
                    ((ltd) ((ltd) hen.a.c()).k("com/google/android/libraries/inputmethod/emoji/widget/EmojiListHolderController", "lambda$new$0", 151, "EmojiListHolderController.java")).w("Clicked view is not EmojiView: %s", view);
                    return;
                }
            case 16:
                FeatureSplitDebugActivity featureSplitDebugActivity = (FeatureSplitDebugActivity) this.a;
                hgj p = featureSplitDebugActivity.p();
                if (p == null) {
                    return;
                }
                gxo.a(19).execute(new gxi(p, featureSplitDebugActivity, 7));
                return;
            case 17:
                ((hoe) this.a).p(hod.CLICK);
                return;
            case 18:
                hoe hoeVar = (hoe) this.a;
                if (hoeVar.R > 0) {
                    ieh.j().g(hok.PROMO_TOOLTIP_V2_CLICK_DELAY, SystemClock.elapsedRealtime() - hoeVar.R);
                }
                View view2 = hoeVar.P;
                if (view2 != null) {
                    if (hoeVar.L == null) {
                        hoeVar.L = new hoo();
                    }
                    final Context context = hoeVar.k;
                    gxd gxdVar = new gxd(hoeVar, 20);
                    hob hobVar = new hob(hoeVar, 1);
                    float a = jdy.a(view2);
                    final int i = a != 1.0f ? -2 : -1;
                    final int i2 = a != 1.0f ? 531 : 528;
                    hky a2 = hlf.a();
                    a2.p("inline_suggestion_tooltip_v2");
                    a2.m = 1;
                    a2.s(R.layout.f135090_resource_name_obfuscated_res_0x7f0e00e8);
                    a2.m(context.getResources().getInteger(R.integer.f131650_resource_name_obfuscated_res_0x7f0c0061));
                    a2.l(R.animator.f690_resource_name_obfuscated_res_0x7f020028);
                    a2.h(R.animator.f700_resource_name_obfuscated_res_0x7f020029);
                    a2.i(true);
                    a2.a = new hle() { // from class: hom
                        @Override // defpackage.hle
                        public final void a(View view3) {
                            Context context2 = context;
                            int i3 = i;
                            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                            layoutParams.width = i3;
                            view3.setLayoutParams(layoutParams);
                            View findViewById = view3.findViewById(R.id.f129990_resource_name_obfuscated_res_0x7f0b21ad);
                            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                            layoutParams2.width = (int) (gvv.f(context2) * (true != jam.r(context2) ? 0.75f : 0.38f));
                            findViewById.setLayoutParams(layoutParams2);
                            findViewById.requestLayout();
                            ((LottieAnimationView) view3.findViewById(R.id.f56560_resource_name_obfuscated_res_0x7f0b0291)).f(0.0f);
                            view3.findViewById(R.id.f56610_resource_name_obfuscated_res_0x7f0b0296).setOnClickListener(bwk.l);
                            ((LinkableTextView) view3.findViewById(R.id.f56620_resource_name_obfuscated_res_0x7f0b0297)).a = new bwd(context2, 8);
                        }
                    };
                    a2.g(context.getString(R.string.f154280_resource_name_obfuscated_res_0x7f14035a));
                    a2.c = view2;
                    a2.d = new hld() { // from class: hon
                        @Override // defpackage.hld
                        public final hlc a(View view3) {
                            return hlc.a(i2, 0, context.getResources().getDimensionPixelSize(R.dimen.f36730_resource_name_obfuscated_res_0x7f0702f6));
                        }
                    };
                    a2.j = gxdVar;
                    a2.i = new ehz(hobVar, 14);
                    hkq.b(a2.a());
                }
                hoeVar.a(true);
                return;
            case 19:
                hwj hwjVar = ((KeyboardSideFrame) this.a).a;
                if (hwjVar == null) {
                    return;
                }
                hwjVar.h.d.b();
                return;
            default:
                hwj hwjVar2 = ((KeyboardSideFrame) this.a).a;
                if (hwjVar2 == null) {
                    return;
                }
                hwi hwiVar = hwjVar2.h;
                hwiVar.h.A();
                hwiVar.g();
                return;
        }
    }
}
