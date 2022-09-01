package defpackage;

import android.graphics.Shader;
import android.view.View;

/* compiled from: PG */
/* renamed from: jj  reason: default package */
/* loaded from: classes.dex */
final class jj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view) {
        return view.isInLayout();
    }

    public static Shader.TileMode b(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
