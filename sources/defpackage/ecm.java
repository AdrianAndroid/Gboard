package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* renamed from: ecm  reason: default package */
/* loaded from: classes.dex */
final class ecm implements hej {
    final /* synthetic */ int a;
    final /* synthetic */ eco b;

    public ecm(eco ecoVar, int i) {
        this.b = ecoVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hxk.a(this.b.s.getContext()).b(this.b.s, 0);
        this.b.u.b(view, this.a, false);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        eco ecoVar = this.b;
        EmojiView emojiView = ecoVar.s;
        String[] strArr = emojiView.b;
        if (strArr == null || strArr.length <= 1) {
            return false;
        }
        View view2 = ecoVar.A;
        if (view2 != null) {
            ecoVar.B = 1.0f;
            if (view2.getLayoutParams().width > 0) {
                ecoVar.B = ecoVar.A.getWidth() / ecoVar.A.getLayoutParams().width;
            }
        }
        gqa.a(ecoVar.v).j(R.string.f159360_resource_name_obfuscated_res_0x7f1405d1);
        ecoVar.y.set(false);
        ecoVar.x.b();
        int[] iArr = new int[2];
        View view3 = ecoVar.A;
        if (view3 != null) {
            view3.getLocationInWindow(iArr);
            iArr[1] = iArr[0] + ecoVar.A.getWidth();
        } else {
            iArr[0] = 0;
            iArr[1] = ecoVar.v.getResources().getDisplayMetrics().widthPixels;
        }
        int dimensionPixelSize = ecoVar.v.getResources().getDimensionPixelSize(R.dimen.f34040_resource_name_obfuscated_res_0x7f07017d);
        int dimensionPixelSize2 = ecoVar.v.getResources().getDimensionPixelSize(R.dimen.f34010_resource_name_obfuscated_res_0x7f07017a);
        ecoVar.x.c(emojiView, ecoVar.w, strArr, new dww(ecoVar, 2), ecoVar.z * ecoVar.B, dimensionPixelSize, dimensionPixelSize2, iArr[0], iArr[1], ecoVar.s.c);
        return true;
    }
}
