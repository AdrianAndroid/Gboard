package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: krk  reason: default package */
/* loaded from: classes.dex */
final class krk extends krl implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b = new CancellationSignal();

    public krk(mop mopVar, byte[] bArr) {
        super(mopVar, null);
    }

    @Override // defpackage.mik, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // defpackage.krl
    protected final void e(mop mopVar) {
        try {
            this.b.setOnCancelListener(this);
            CancellationSignal cancellationSignal = this.b;
            opu opuVar = ((krb) mopVar.c).e;
            synchronized (((krj) opuVar.a).i) {
                int i = ((krj) opuVar.a).l;
                if (i != 0) {
                    jdg.H(i > 0, "Refcount went negative!", i);
                    ((krj) opuVar.a).l++;
                } else {
                    throw new CancellationException("database is closed");
                }
            }
            Cursor rawQueryWithFactory = ((krb) mopVar.c).a.rawQueryWithFactory(new krq((Object[]) mopVar.b), (String) mopVar.a, null, null, cancellationSignal);
            ((krb) mopVar.c).e.f();
            if (!isCancelled() && rawQueryWithFactory != null) {
                rawQueryWithFactory.getCount();
            }
            if (c(rawQueryWithFactory)) {
                return;
            }
            kki.m(rawQueryWithFactory);
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
