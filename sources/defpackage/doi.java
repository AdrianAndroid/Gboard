package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;

/* compiled from: PG */
/* renamed from: doi  reason: default package */
/* loaded from: classes.dex */
public final class doi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public doi(Context context) {
        this.b = context;
        this.a = "image_manager_disk_cache";
    }

    public /* synthetic */ doi(cmr cmrVar, Runnable runnable) {
        this.b = cmrVar;
        this.a = runnable;
    }

    public doi(LatinIme latinIme, Delight5Facilitator delight5Facilitator) {
        this.b = latinIme;
        this.a = delight5Facilitator;
    }

    public doi(LatinIme latinIme, hls hlsVar) {
        this.a = latinIme;
        this.b = hlsVar;
    }

    public final void a(boolean z, float f, float f2, int i, boolean z2) {
        LatinIme latinIme = (LatinIme) this.b;
        latinIme.u = z;
        latinIme.w = f;
        latinIme.x = f2;
        latinIme.y = i;
        latinIme.v = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, hls] */
    public final void b(String str) {
        this.b.hV(str, false, 1);
    }
}
