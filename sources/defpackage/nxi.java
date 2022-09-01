package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nxi  reason: default package */
/* loaded from: classes2.dex */
public abstract class nxi {
    private boolean a;
    private InputStream b;
    private Queue c;
    public final nwn d;
    public final int e;
    public final ofg f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public nxi(nwn nwnVar, int i, ofg ofgVar) {
        this.d = nwnVar;
        this.e = i;
        this.f = ofgVar;
    }

    protected abstract int a(Parcel parcel);

    protected abstract int b(Parcel parcel);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(InputStream inputStream) {
        e();
        Queue queue = this.c;
        if (queue != null) {
            queue.add(inputStream);
        } else if (this.b == null) {
            this.b = inputStream;
        } else {
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.c = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.d.r();
    }

    protected final boolean i() {
        Queue queue = this.c;
        return queue != null ? !queue.isEmpty() : this.b != null && this.i == 0;
    }

    public final synchronized String toString() {
        String simpleName;
        String str;
        int i;
        simpleName = getClass().getSimpleName();
        int i2 = this.k;
        str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL";
        i = this.i;
        return simpleName + "[S=" + str + "/NDM=" + i + "]";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[Catch: all -> 0x012e, TryCatch #4 {all -> 0x012e, blocks: (B:15:0x0032, B:21:0x00f8, B:22:0x0107, B:25:0x0055, B:26:0x005a, B:29:0x0075, B:31:0x0079, B:33:0x008a, B:35:0x0094, B:40:0x00b5, B:42:0x00ba, B:44:0x00c5, B:45:0x00cd, B:46:0x00d9, B:47:0x00ea, B:49:0x00ee, B:51:0x00f4, B:56:0x00e2, B:57:0x00e4, B:58:0x00e5, B:59:0x007c, B:61:0x0080, B:63:0x005d, B:65:0x006f, B:69:0x012d, B:36:0x0098, B:38:0x009e, B:52:0x00a4), top: B:14:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxi.g():void");
    }

    private final void c(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        boolean z = false;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            jdg.F(z);
        } else if (i3 == 2) {
            if (i2 == 2) {
                z = true;
            }
            jdg.F(z);
        } else if (i3 == 3) {
            if (i2 == 3) {
                z = true;
            }
            jdg.F(z);
        }
        this.k = i;
    }
}
