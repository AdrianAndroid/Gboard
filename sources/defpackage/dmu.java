package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.inputmethod.libs.languageselection.LanguageDraggableView;

/* compiled from: PG */
/* renamed from: dmu  reason: default package */
/* loaded from: classes.dex */
public final class dmu extends dmq {
    private static final ltg s = ltg.j("com/google/android/apps/inputmethod/libs/languageselection/LanguageDraggableViewHolder");
    private final Context t;
    private Drawable u;

    public dmu(Context context, LanguageDraggableView languageDraggableView, dms dmsVar) {
        super(languageDraggableView, dmsVar);
        this.t = context;
    }

    @Override // defpackage.dmq
    public final void F() {
        Drawable drawable = this.u;
        if (drawable != null) {
            this.a.setBackground(drawable);
            this.u = null;
        }
    }

    @Override // defpackage.dmq
    public final void G() {
        if (this.u != null) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = this.t.getTheme().obtainStyledAttributes(new int[]{16842836, 16842801});
            this.u = this.a.getBackground();
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                try {
                    int color = obtainStyledAttributes.getColor(i, 0);
                    if (color != 0) {
                        this.a.setBackground(new ColorDrawable(color));
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Resources.NotFoundException e) {
            ((ltd) ((ltd) ((ltd) s.c()).i(e)).k("com/google/android/apps/inputmethod/libs/languageselection/LanguageDraggableViewHolder", "onItemSelected", '7', "LanguageDraggableViewHolder.java")).t("Failed to obtain styled attributes");
        }
    }
}
