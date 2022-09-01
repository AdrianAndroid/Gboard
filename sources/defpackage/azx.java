package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: azx  reason: default package */
/* loaded from: classes.dex */
final class azx implements avj {
    private final Object a;
    private final /* synthetic */ int b;

    public azx(File file, int i) {
        this.b = i;
        this.a = file;
    }

    public azx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.avj
    public final Class a() {
        return this.b != 0 ? ByteBuffer.class : this.a.getClass();
    }

    @Override // defpackage.avj
    public final void d() {
    }

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        if (this.b != 0) {
            try {
                aviVar.b(bfw.b((File) this.a));
                return;
            } catch (IOException e) {
                aviVar.e(e);
                return;
            }
        }
        aviVar.b(this.a);
    }

    @Override // defpackage.avj
    public final void fh() {
    }

    @Override // defpackage.avj
    public final int g() {
        return 1;
    }
}
