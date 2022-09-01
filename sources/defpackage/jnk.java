package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jnk  reason: default package */
/* loaded from: classes.dex */
public final class jnk implements Closeable {
    private static final jns a = jnl.a("AndroidLearningContext");
    private static final Map b = new HashMap();
    private static jnk c;
    private final Context d;
    private final Map e = new HashMap();
    private final fwo f;
    private int g;

    private jnk(Context context) {
        this.d = context;
        this.g++;
        fwo fwoVar = (fwo) c(fwo.class);
        this.f = fwoVar;
        fwoVar.d(jnx.LEARNING_CONTEXT_CREATED);
        fwoVar.d(jnx.LEARNING_CONTEXT_REFCOUNT_INCREMENTED);
    }

    public static synchronized jnk b(Context context) {
        jnk jnkVar;
        synchronized (jnk.class) {
            jdg.u(context);
            jnk jnkVar2 = c;
            if (jnkVar2 == null) {
                c = new jnk(context.getApplicationContext());
            } else {
                jnkVar2.d();
            }
            jnkVar = c;
        }
        return jnkVar;
    }

    public static synchronized void e(Class cls, leq leqVar) {
        synchronized (jnk.class) {
            Map map = b;
            jdg.u(leqVar);
            map.put(cls, leqVar);
        }
    }

    public final Context a() {
        Context context;
        synchronized (jnk.class) {
            jdg.G(this.g > 0, "#getContext() called after #close()");
            context = this.d;
        }
        return context;
    }

    public final Object c(Class cls) {
        Object cast;
        synchronized (jnk.class) {
            jdg.G(this.g > 0, "#getComponent() called after #close()");
            Object obj = this.e.get(cls);
            if (obj == null) {
                leq leqVar = (leq) b.get(cls);
                if (leqVar == null) {
                    String obj2 = cls.toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("requested component type not registered: " + obj2);
                    a.f(illegalArgumentException, "cannot retrieve component");
                    throw illegalArgumentException;
                }
                obj = leqVar.a(this);
                this.e.put(cls, obj);
            }
            cast = cls.cast(obj);
        }
        return cast;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (jnk.class) {
            if (this.g <= 0) {
                a.e("close() called too many times!");
                this.f.e(job.LEARNING_CONTEXT_REFCOUNT_MISMATCH);
                return;
            }
            this.f.d(jnx.LEARNING_CONTEXT_REFCOUNT_DECREMENTED);
            if (this.g == 1) {
                this.f.d(jnx.LEARNING_CONTEXT_DESTROYED);
                try {
                    for (Object obj : this.e.values()) {
                        if (obj instanceof AutoCloseable) {
                            try {
                                ((AutoCloseable) obj).close();
                            } catch (Exception e) {
                                a.f(e, "Cannot close component instance, ignored.");
                            }
                        }
                    }
                    this.e.clear();
                    c = null;
                } catch (Throwable th) {
                    this.e.clear();
                    c = null;
                    throw th;
                }
            }
            this.g--;
        }
    }

    public final void d() {
        synchronized (jnk.class) {
            this.g++;
            ((fwo) c(fwo.class)).d(jnx.LEARNING_CONTEXT_REFCOUNT_INCREMENTED);
        }
    }
}
