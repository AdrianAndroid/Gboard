package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: pbq  reason: default package */
/* loaded from: classes2.dex */
public final class pbq {
    public static final pbq a = new pbq();
    static final pbl b = new pbl();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();

    public pbq() {
        new AtomicReference();
        new AtomicReference();
    }

    static Object a(Class cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            Iterator it = properties2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String obj = entry.getKey().toString();
                if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String str = "rxjava.plugin." + obj.substring(0, obj.length() - 6).substring(14) + ".impl";
                    String property2 = properties2.getProperty(str);
                    if (property2 == null) {
                        throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                    property = property2;
                }
            }
        }
        if (property != null) {
            try {
                return Class.forName(property).asSubclass(cls).newInstance();
            } catch (ClassCastException e) {
                throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException(simpleName + " implementation class not found: " + property, e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(simpleName + " implementation not able to be accessed: " + property, e3);
            } catch (InstantiationException e4) {
                throw new IllegalStateException(simpleName + " implementation not able to be instantiated: " + property, e4);
            }
        }
        return null;
    }

    public final pbs b() {
        if (this.d.get() == null) {
            Object a2 = a(pbs.class, System.getProperties());
            if (a2 == null) {
                pbs.a(this.d, pbt.a);
            } else {
                pbs.a(this.d, (pbs) a2);
            }
        }
        return (pbs) this.d.get();
    }

    public final void c() {
        if (this.c.get() == null) {
            Object a2 = a(pbl.class, System.getProperties());
            if (a2 == null) {
                pbs.a(this.c, b);
            } else {
                pbs.a(this.c, (pbl) a2);
            }
        }
        pbl pblVar = (pbl) this.c.get();
    }

    public final void d() {
        if (this.e.get() == null) {
            Object a2 = a(pbr.class, System.getProperties());
            if (a2 == null) {
                pbs.a(this.e, pbr.a);
            } else {
                pbs.a(this.e, (pbr) a2);
            }
        }
        pbr pbrVar = (pbr) this.e.get();
    }
}
