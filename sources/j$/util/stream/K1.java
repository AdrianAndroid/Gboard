package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K1 implements Runnable {
    public final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public /* synthetic */ K1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                try {
                    ((Runnable) obj).run();
                    ((Runnable) obj2).run();
                    return;
                } catch (Throwable th) {
                    try {
                        ((Runnable) obj2).run();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            default:
                try {
                    ((BaseStream) obj).close();
                    ((BaseStream) obj2).close();
                    return;
                } catch (Throwable th3) {
                    try {
                        ((BaseStream) obj2).close();
                    } catch (Throwable th4) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
        }
    }
}
