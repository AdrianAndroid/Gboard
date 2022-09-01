package defpackage;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: PG */
/* renamed from: zt  reason: default package */
/* loaded from: classes2.dex */
final class zt {
    static void a(View view) {
        view.cancelDragAndDrop();
    }

    static void b(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    static void c(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    static void e(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    static boolean f(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }
}
