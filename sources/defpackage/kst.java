package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* renamed from: kst  reason: default package */
/* loaded from: classes.dex */
public final class kst implements abs {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public kst(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.abs
    public final boolean a(View view) {
        this.b.B(this.a);
        return true;
    }
}
