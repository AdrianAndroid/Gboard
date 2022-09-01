package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: haf  reason: default package */
/* loaded from: classes.dex */
final class haf extends hsh {
    final /* synthetic */ hag a;

    public haf(hag hagVar) {
        this.a = hagVar;
    }

    @Override // defpackage.hsh
    public final void a(String str, Bundle bundle) {
        if ("CHANGE_KEYBOARD_LANGUAGE".equals(str)) {
            hag hagVar = this.a;
            String string = bundle.getString("keyboard_language");
            if (string == null) {
                ((ltd) ((ltd) hag.a.d()).k("com/google/android/libraries/inputmethod/dynamiclanguagesetter/DynamicLanguageSetterModule", "handleChangeInputLanguagePrivateCommand", 132, "DynamicLanguageSetterModule.java")).t("The input language is not specified.");
                return;
            }
            try {
                hagVar.c.g(jav.f(string));
            } catch (IllegalArgumentException e) {
                ((ltd) ((ltd) ((ltd) hag.a.d()).i(e)).k("com/google/android/libraries/inputmethod/dynamiclanguagesetter/DynamicLanguageSetterModule", "handleChangeInputLanguagePrivateCommand", 139, "DynamicLanguageSetterModule.java")).w("The input language %s is wrong format", string);
            }
        }
    }
}
