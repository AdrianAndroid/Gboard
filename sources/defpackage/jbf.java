package defpackage;

import android.content.Context;
import android.renderscript.RenderScript;

/* compiled from: PG */
/* renamed from: jbf  reason: default package */
/* loaded from: classes.dex */
public final class jbf implements gvz {
    private final /* synthetic */ int a;

    public jbf(int i) {
        this.a = i;
    }

    @Override // defpackage.gvz
    public final /* synthetic */ Object a(Object obj) {
        return this.a != 0 ? new dsd((Context) obj) : RenderScript.create((Context) obj);
    }
}
