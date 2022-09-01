package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* renamed from: ouz  reason: default package */
/* loaded from: classes2.dex */
public final class ouz implements ovp {
    private final out a;
    private final Inflater b;
    private int c;
    private boolean d;

    public ouz(out outVar, Inflater inflater) {
        this.a = outVar;
        this.b = inflater;
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.a.a();
    }

    @Override // defpackage.ovp
    public final long b(our ourVar, long j) {
        do {
            long c = c(ourVar);
            if (c > 0) {
                return c;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.C());
        throw new EOFException("source exhausted prematurely");
    }

    public final long c(our ourVar) {
        if (!this.d) {
            try {
                ovk v = ourVar.v(1);
                int min = (int) Math.min(8192L, 8192 - v.c);
                if (this.b.needsInput() && !this.a.C()) {
                    ovk ovkVar = ((ovj) this.a).b.a;
                    oll.b(ovkVar);
                    int i = ovkVar.c;
                    int i2 = ovkVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    this.b.setInput(ovkVar.a, i2, i3);
                }
                int inflate = this.b.inflate(v.a, v.c, min);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - this.b.getRemaining();
                    this.c -= remaining;
                    this.a.B(remaining);
                }
                if (inflate > 0) {
                    v.c += inflate;
                    long j = inflate;
                    ourVar.b += j;
                    return j;
                } else if (v.b != v.c) {
                    return 0L;
                } else {
                    ourVar.a = v.a();
                    ovl.b(v);
                    return 0L;
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
