package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: gyy  reason: default package */
/* loaded from: classes.dex */
public final class gyy implements gyz {
    private final Context a;

    public gyy(Context context) {
        this.a = context;
    }

    @Override // defpackage.gyz
    public final ColorStateList a(int i) {
        return uv.c(this.a, i);
    }

    @Override // defpackage.gyz
    public final Drawable b(int i) {
        return this.a.getDrawable(i);
    }
}
