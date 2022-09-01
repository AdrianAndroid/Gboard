package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hcp  reason: default package */
/* loaded from: classes.dex */
public final class hcp implements hcv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupViewController");
    public final Context b;
    public View.OnClickListener c;
    public PopupWindow d;
    private final View.OnClickListener e;

    public hcp(Context context) {
        this(context, null);
    }

    public hcp(Context context, byte[] bArr) {
        this.e = new fat(this, 14);
        this.b = context;
    }

    @Override // defpackage.hcv
    public final void a() {
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // defpackage.hcv
    public final void b() {
        PopupWindow popupWindow = this.d;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    @Override // defpackage.hcv
    public final void c(final View view, View view2, String[] strArr, final PopupWindow.OnDismissListener onDismissListener, float f, int i, int i2, int i3, int i4, hei heiVar) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        hcn hcnVar = new hcn(this.b, strArr, this.e, (int) (i * f), (int) (i2 * f), f, heiVar);
        View q = aad.q(hcnVar, R.id.f54270_resource_name_obfuscated_res_0x7f0b018f);
        int i5 = iArr[0];
        int width = view.getWidth();
        int a2 = hcnVar.a();
        float elevation = q.getElevation();
        float max = Math.max((i5 + ((width * f) / 2.0f)) - (a2 / 2.0f), i3 + elevation);
        if (hcnVar.a() + max >= i4) {
            max = (i4 - hcnVar.a()) - elevation;
        }
        int max2 = Math.max(0, iArr[1] - (((((hcnVar.d * hcnVar.e) + hcnVar.c.getPaddingTop()) + hcnVar.c.getPaddingBottom()) + hcnVar.b.getPaddingTop()) + hcnVar.b.getPaddingBottom()));
        PopupWindow popupWindow = new PopupWindow((View) hcnVar, -2, -2, false);
        this.d = popupWindow;
        popupWindow.setTouchable(hcnVar.isEnabled());
        this.d.setOutsideTouchable(true);
        this.d.setSoftInputMode(32);
        PopupWindow popupWindow2 = this.d;
        Drawable background = q.getBackground();
        if (background == null && (background = this.b.getDrawable(R.drawable.f49930_resource_name_obfuscated_res_0x7f080312)) == null) {
            background = new ColorDrawable(-7829368);
        }
        popupWindow2.setBackgroundDrawable(background);
        this.d.setElevation(elevation);
        q.setElevation(0.0f);
        q.setBackground(null);
        this.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: hco
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                hcp hcpVar = hcp.this;
                PopupWindow.OnDismissListener onDismissListener2 = onDismissListener;
                View view3 = view;
                onDismissListener2.onDismiss();
                gqa.a(hcpVar.b).o(view3);
            }
        });
        this.d.setAnimationStyle(R.style.f203200_resource_name_obfuscated_res_0x7f1507dc);
        if (!this.d.isShowing()) {
            this.d.showAtLocation(view2, 0, (int) max, max2);
        } else {
            PopupWindow popupWindow3 = this.d;
            popupWindow3.update(iArr[0], iArr[1], popupWindow3.getWidth(), this.d.getHeight());
        }
        hcnVar.post(new gxi(this, hcnVar, 4));
    }
}
