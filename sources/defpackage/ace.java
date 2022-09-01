package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* compiled from: PG */
/* renamed from: ace  reason: default package */
/* loaded from: classes.dex */
public final class ace {
    public static ColorStateList a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static PorterDuff.Mode b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
