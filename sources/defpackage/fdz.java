package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fdz */
/* loaded from: classes.dex */
public final class fdz {
    public static boolean a(Context context) {
        ino M = ino.M(context);
        return M.ah(R.string.f160930_resource_name_obfuscated_res_0x7f14067d) && !M.aj(R.string.f160930_resource_name_obfuscated_res_0x7f14067d);
    }

    public static boolean b() {
        int i = ffg.a;
        return ((Boolean) ffa.i.c()).booleanValue();
    }

    public static void c(Animator animator, View view) {
        ((ValueAnimator) animator).addUpdateListener(new fco(view));
    }

    public static void d(View view, String str) {
        view.findViewById(R.id.f130530_resource_name_obfuscated_res_0x7f0b21f0).setOnClickListener(new fat(str, 7));
    }

    public static /* synthetic */ int e(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }
}
