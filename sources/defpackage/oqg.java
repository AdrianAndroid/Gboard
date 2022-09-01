package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oqg  reason: default package */
/* loaded from: classes2.dex */
public final class oqg extends oqq {
    final /* synthetic */ oqh a;
    private final opg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqg(oqh oqhVar, opg opgVar) {
        super("OkHttp %s", oqhVar.e());
        this.a = oqhVar;
        this.c = opgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.a.d.a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.oqq
    protected final void b() {
        boolean z;
        String str;
        opr oprVar;
        Object obj = "Callback failure for ";
        this.a.c.e();
        try {
            try {
                oql f = this.a.f();
                try {
                    if (this.a.b.c) {
                        this.c.a(new IOException("Canceled"));
                    } else {
                        this.c.b(f);
                    }
                    obj = this.a.a.c;
                    oprVar = obj;
                } catch (IOException e) {
                    e = e;
                    z = true;
                    str = obj;
                    IOException d = this.a.d(e);
                    if (z) {
                        otu otuVar = otu.c;
                        oqh oqhVar = this.a;
                        String str2 = "canceled ";
                        if (true != oqhVar.b.c) {
                            str2 = "";
                        }
                        otuVar.h(4, str + (str2 + "call to " + oqhVar.e()), d);
                    } else {
                        this.c.a(d);
                    }
                    oprVar = this.a.a.c;
                    oprVar.c(this);
                }
            } catch (Throwable th) {
                this.a.a.c.c(this);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            z = false;
            str = obj;
        }
        oprVar.c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(ExecutorService executorService) {
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                this.c.a(interruptedIOException);
                this.a.a.c.c(this);
            }
        } catch (Throwable th) {
            this.a.a.c.c(this);
            throw th;
        }
    }
}
