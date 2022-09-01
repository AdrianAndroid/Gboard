package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqj  reason: default package */
/* loaded from: classes.dex */
public final class fqj extends gco {
    final /* synthetic */ fqq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqj(fqq fqqVar, Looper looper) {
        super(looper);
        this.a = fqqVar;
    }

    private static final void a(Message message) {
        fqk fqkVar = (fqk) message.obj;
        fqkVar.b();
        fqkVar.f();
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [fpb, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.a.n.get() != message.arg1) {
            if (!b(message)) {
                return;
            }
            a(message);
        } else if ((message.what != 1 && message.what != 7 && message.what != 4 && message.what != 5) || this.a.n()) {
            PendingIntent pendingIntent = null;
            if (message.what == 4) {
                this.a.k = new fmt(message.arg2);
                fqq fqqVar = this.a;
                if (!fqqVar.l && !TextUtils.isEmpty(fqqVar.c()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(fqqVar.c());
                        fqq fqqVar2 = this.a;
                        if (!fqqVar2.l) {
                            fqqVar2.z(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                fmt fmtVar = this.a.k;
                if (fmtVar == null) {
                    fmtVar = new fmt(8);
                }
                this.a.f.a(fmtVar);
                System.currentTimeMillis();
            } else if (message.what == 5) {
                fmt fmtVar2 = this.a.k;
                if (fmtVar2 == null) {
                    fmtVar2 = new fmt(8);
                }
                this.a.f.a(fmtVar2);
                System.currentTimeMillis();
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                this.a.f.a(new fmt(message.arg2, pendingIntent));
                System.currentTimeMillis();
            } else if (message.what == 6) {
                this.a.z(5, null);
                opu opuVar = this.a.r;
                if (opuVar != null) {
                    opuVar.a.a(message.arg2);
                }
                int i = message.arg2;
                System.currentTimeMillis();
                this.a.A(5, 1, null);
            } else if (message.what != 2 || this.a.m()) {
                if (b(message)) {
                    fqk fqkVar = (fqk) message.obj;
                    synchronized (fqkVar) {
                        obj = fqkVar.d;
                        if (fqkVar.e) {
                            String obj2 = fqkVar.toString();
                            Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                        }
                    }
                    if (obj != null) {
                        try {
                            fqkVar.d();
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    synchronized (fqkVar) {
                        fqkVar.e = true;
                    }
                    fqkVar.f();
                    return;
                }
                int i2 = message.what;
                Log.wtf("GmsClient", "Don't know how to handle message: " + i2, new Exception());
            } else {
                a(message);
            }
        } else {
            a(message);
        }
    }
}
