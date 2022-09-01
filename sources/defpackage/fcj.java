package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;

/* compiled from: PG */
/* renamed from: fcj  reason: default package */
/* loaded from: classes.dex */
public final class fcj {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoicePermissionKeyboardOverlay");

    public static View a(hsk hskVar, ice iceVar) {
        ViewGroup L = hskVar.L(iceVar);
        if (L != null) {
            return ((KeyboardViewHolder) L).a;
        }
        return null;
    }

    public static void b() {
        hkp.b("permission_promo_overlay", false);
    }

    public static void c(View view, View view2, View view3) {
        if (!view2.isAttachedToWindow()) {
            hkp.b("permission_promo_overlay", true);
        }
        int height = view2.getHeight();
        int height2 = view3.getHeight();
        int width = view3.getWidth();
        float scaleY = view2.getScaleY();
        float scaleX = view3.getScaleX();
        float scaleY2 = view3.getScaleY();
        float scaleX2 = view.getScaleX();
        float scaleY3 = view.getScaleY();
        int i = (int) ((height * scaleY) / scaleY3);
        int i2 = (int) ((height2 * scaleY2) / scaleY3);
        d(view, R.id.f130830_resource_name_obfuscated_res_0x7f0b220f, i + i2);
        d(view, R.id.f130760_resource_name_obfuscated_res_0x7f0b2208, i);
        d(view, R.id.f130750_resource_name_obfuscated_res_0x7f0b2207, i2);
        double d = (int) ((width * scaleX) / scaleX2);
        Double.isNaN(d);
        int i3 = (int) (0.1d * d);
        View findViewById = view.findViewById(R.id.f130820_resource_name_obfuscated_res_0x7f0b220e);
        double d2 = i2;
        Double.isNaN(d2);
        findViewById.setPadding(i3, (int) (d2 * 0.14d), i3, 0);
        view.findViewById(R.id.f130790_resource_name_obfuscated_res_0x7f0b220b).setPadding(i3, 0, i3, 0);
        Double.isNaN(d);
        int i4 = (int) (d * 0.07d);
        view.findViewById(R.id.f130770_resource_name_obfuscated_res_0x7f0b2209).setPadding(i4, 0, i4, 0);
    }

    private static void d(View view, int i, int i2) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
        constraintLayout.d(i2);
        constraintLayout.c(i2);
    }
}
