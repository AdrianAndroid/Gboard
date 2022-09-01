package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: ksx  reason: default package */
/* loaded from: classes.dex */
public final class ksx {
    public int a;
    public boolean b;
    public final /* synthetic */ BottomSheetBehavior c;
    private final Runnable d = new kvl(this, 1);

    public ksx(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        WeakReference weakReference = this.c.A;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        aad.H((View) this.c.A.get(), this.d);
        this.b = true;
    }
}
