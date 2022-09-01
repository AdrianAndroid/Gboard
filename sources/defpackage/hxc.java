package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* renamed from: hxc  reason: default package */
/* loaded from: classes.dex */
public final class hxc {
    public ibz a;
    public final hxe[] b = new hxe[ice.values().length];

    public hxc() {
        for (int i = 0; i < ice.values().length; i++) {
            this.b[i] = new hxe();
        }
    }

    public final void a(int i, int i2) {
        Animator animator = (Animator) this.b[i2].a().get(i);
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void b(int i, ibz ibzVar, int i2, boolean z) {
        if (this.a == ibzVar) {
            this.b[i].g = i2;
        } else if (!z) {
        } else {
            ((ltd) ((ltd) hxi.b.c()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController$CurrentKeyboardStatus", "setViewStatus", 1541, "KeyboardViewController.java")).G("Setting the SoftKeyboardView status for different keyboard type, current: %s, new: %s", this.a, ibzVar);
        }
    }
}
