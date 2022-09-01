package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* compiled from: PG */
/* renamed from: zc  reason: default package */
/* loaded from: classes2.dex */
public final class zc {
    static PointerIcon a(Bitmap bitmap, float f, float f2) {
        return PointerIcon.create(bitmap, f, f2);
    }

    public static PointerIcon b(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    static PointerIcon c(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }
}
