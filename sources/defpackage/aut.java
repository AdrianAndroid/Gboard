package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: aut  reason: default package */
/* loaded from: classes.dex */
public final class aut implements auu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aut(avx avxVar, axn axnVar, int i) {
        this.c = i;
        this.b = avxVar;
        this.a = axnVar;
    }

    public aut(InputStream inputStream, axn axnVar, int i) {
        this.c = i;
        this.a = inputStream;
        this.b = axnVar;
    }

    public aut(ByteBuffer byteBuffer, axn axnVar, int i) {
        this.c = i;
        this.a = byteBuffer;
        this.b = axnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [axn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [axn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [axn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [axn, java.lang.Object] */
    @Override // defpackage.auu
    public final int a(auq auqVar) {
        bbp bbpVar;
        int i = this.c;
        if (i == 0) {
            try {
                return auqVar.a((InputStream) this.a, this.b);
            } finally {
                ((InputStream) this.a).reset();
            }
        } else if (i != 1) {
            try {
                bbpVar = new bbp(new FileInputStream(((avx) this.b).a().getFileDescriptor()), this.a);
                try {
                    int a = auqVar.a(bbpVar, this.a);
                    bbpVar.b();
                    ((avx) this.b).a();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    if (bbpVar != null) {
                        bbpVar.b();
                    }
                    ((avx) this.b).a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bbpVar = null;
            }
        } else {
            try {
                return auqVar.b((ByteBuffer) this.a, this.b);
            } finally {
                bfw.d((ByteBuffer) this.a);
            }
        }
    }
}
