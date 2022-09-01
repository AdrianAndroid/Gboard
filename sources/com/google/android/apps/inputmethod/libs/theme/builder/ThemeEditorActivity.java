package com.google.android.apps.inputmethod.libs.theme.builder;

import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ThemeEditorActivity extends epk {
    public static final ltg m = ltg.j("com/google/android/apps/inputmethod/libs/theme/builder/ThemeEditorActivity");
    public File n;

    @Override // defpackage.epk
    protected final ept l(epw epwVar) {
        return new ept(this, this, epwVar, 2);
    }

    @Override // defpackage.epk, defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        float f;
        epw epwVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            ((ltd) ((ltd) m.d()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeEditorActivity", "onCreate", 34, "ThemeEditorActivity.java")).t("intent null");
            t();
            return;
        }
        String stringExtra = intent.getStringExtra("target_user_image_theme_file_name");
        if (stringExtra == null) {
            ((ltd) ((ltd) m.d()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeEditorActivity", "onCreate", 41, "ThemeEditorActivity.java")).t("target user image theme file name missing.");
            t();
            return;
        }
        File file = new File(stringExtra);
        this.n = file;
        erv b = erv.b(this, file);
        if (b == null) {
            ((ltd) ((ltd) m.d()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeEditorActivity", "loadThemeBuilderFromFile", 67, "ThemeEditorActivity.java")).w("Invalid zip file: %s", file);
            epwVar = null;
        } else {
            lym d = b.d("original_cropping");
            if (d != null || (d = b.d("background")) != null) {
                epw epwVar2 = new epw(d);
                euw c = b.c(Collections.emptySet(), euw.c);
                Map r = era.r(c.b, lrr.a);
                eut eutVar = (eut) r.get("__overlay_transparency");
                if (eutVar == null) {
                    Iterator it = c.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            f = 0.4f;
                            break;
                        }
                        euv euvVar = (euv) it.next();
                        euu b2 = euu.b(euvVar.c);
                        if (b2 == null) {
                            b2 = euu.NONE;
                        }
                        if (b2 == euu.BACKGROUND_ALPHA && euvVar.b.contains(".keyboard-body-area")) {
                            eut eutVar2 = euvVar.d;
                            if (eutVar2 == null) {
                                eutVar2 = eut.j;
                            }
                            f = 1.0f - epw.a((float) eutVar2.i);
                        }
                    }
                } else {
                    f = (float) eutVar.i;
                }
                epwVar2.i(f);
                float f2 = epwVar2.d;
                epwVar2.f = epw.c(r, "__cropping_scale", epwVar2.f / f2) * f2;
                epwVar2.g(epw.c(r, "__cropping_rect_center_x", epwVar2.g * f2) / f2, epw.c(r, "__cropping_rect_center_y", epwVar2.h * f2) / f2);
                epwVar2.i = b.a.e;
                epwVar = epwVar2;
            } else {
                throw new IllegalStateException("Background bitmap is empty");
            }
        }
        if (epwVar == null) {
            ((ltd) ((ltd) m.d()).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeEditorActivity", "onCreate", 49, "ThemeEditorActivity.java")).t("ThemeBuilder null");
            t();
            return;
        }
        o();
        s(epwVar);
    }

    @Override // defpackage.epk
    protected final void q() {
        t();
    }

    @Override // defpackage.epk
    protected final void r() {
        File c = erj.c(this);
        epw m2 = m();
        if (m2 == null || c == null) {
            t();
        } else {
            gxo.a(1).hP(new epv(this, m2, c, 0));
        }
    }

    public final void t() {
        setResult(0);
        finish();
    }
}
