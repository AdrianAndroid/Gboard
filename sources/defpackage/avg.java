package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: avg  reason: default package */
/* loaded from: classes.dex */
public abstract class avg implements avj {
    private final String a;
    private final AssetManager b;
    private Object c;

    public avg(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // defpackage.avj
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                e(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void e(Object obj);

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        try {
            Object b = b(this.b, this.a);
            this.c = b;
            aviVar.b(b);
        } catch (IOException e) {
            aviVar.e(e);
        }
    }

    @Override // defpackage.avj
    public final void fh() {
    }

    @Override // defpackage.avj
    public final int g() {
        return 1;
    }
}
