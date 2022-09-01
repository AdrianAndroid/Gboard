package defpackage;

import android.view.View;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bwk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bwk implements View.OnClickListener {
    private final /* synthetic */ int n;
    public static final /* synthetic */ bwk m = new bwk(13);
    public static final /* synthetic */ bwk l = new bwk(12);
    public static final /* synthetic */ bwk k = new bwk(11);
    public static final /* synthetic */ bwk j = new bwk(9);
    public static final /* synthetic */ bwk i = new bwk(8);
    public static final /* synthetic */ bwk h = new bwk(7);
    public static final /* synthetic */ bwk g = new bwk(6);
    public static final /* synthetic */ bwk f = new bwk(5);
    public static final /* synthetic */ bwk e = new bwk(4);
    public static final /* synthetic */ bwk d = new bwk(3);
    public static final /* synthetic */ bwk c = new bwk(2);
    public static final /* synthetic */ bwk b = new bwk(1);
    public static final /* synthetic */ bwk a = new bwk(0);

    public /* synthetic */ bwk(int i2) {
        this.n = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.n) {
            case 0:
                return;
            case 1:
                eju.s();
                bwg.d(view);
                return;
            case 2:
                boe.m();
                return;
            case 3:
                new hso().at(hfd.d(new iay(-10004, null, ibz.a.l)));
                return;
            case 4:
                boe.m();
                return;
            case 5:
                boe.m();
                return;
            case 6:
                hkp.b("voice_donation_confirm_banner", false);
                return;
            case 7:
                return;
            case 8:
                fcj.b();
                return;
            case 9:
                fcj.b();
                return;
            case 10:
                hxk.a(view.getContext()).b(view, 0);
                if (view instanceof CustomImageView) {
                    hgw hgwVar = ((CustomImageView) view).a;
                    throw null;
                } else {
                    ((ltd) ((ltd) hbs.a.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$1", "onClick", 56, "EmojiListController.java")).w("Clicked view is not CustomImageView: %s", view);
                    return;
                }
            case 11:
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((ltd) ((ltd) hoo.a.b()).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionTooltip", "lambda$initTooltipV2$6", 335, "InlineSuggestionTooltip.java")).t("Click close button to dismiss tooltip v2.");
                hkp.b("inline_suggestion_tooltip_v2", false);
                return;
            default:
                hkp.b("SLOWNESS_REPORTER_BANNER", false);
                return;
        }
    }
}
