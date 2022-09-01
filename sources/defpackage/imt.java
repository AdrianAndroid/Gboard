package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: imt  reason: default package */
/* loaded from: classes.dex */
public abstract class imt {
    private static final Class[] c = {Context.class, AttributeSet.class};
    protected final Context a;
    public lrv b;
    private final String[] d;
    private final Object[] e;
    private final qv f = new qv();

    public imt(Context context, String[] strArr) {
        Object[] objArr = new Object[2];
        this.e = objArr;
        this.a = context;
        this.d = strArr;
        objArr[0] = context;
    }

    private final Object e(String str, AttributeSet attributeSet) {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) this.f.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.a.getClassLoader();
                if (str.indexOf(46) >= 0) {
                    cls = classLoader.loadClass(str);
                } else {
                    String[] strArr = this.d;
                    ClassNotFoundException classNotFoundException = null;
                    char c2 = 0;
                    while (true) {
                        if (c2 > 0) {
                            cls = null;
                            break;
                        }
                        try {
                            cls = classLoader.loadClass(strArr[0] + str);
                            break;
                        } catch (ClassNotFoundException e) {
                            classNotFoundException = e;
                            c2 = 1;
                        }
                    }
                    if (cls == null) {
                        if (classNotFoundException == null) {
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                        throw classNotFoundException;
                    }
                }
                constructor = cls.getConstructor(c);
                constructor.setAccessible(true);
                this.f.put(str, constructor);
            } catch (Exception e2) {
                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str, e2);
            }
        }
        Object[] objArr = this.e;
        objArr[1] = attributeSet;
        Object newInstance = constructor.newInstance(objArr);
        c(newInstance, attributeSet);
        return newInstance;
    }

    private final Object f(XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    Object e = e(xmlPullParser.getName(), asAttributeSet);
                    g(xmlPullParser, e, asAttributeSet);
                    return e;
                } else if (next == 1) {
                    String positionDescription = xmlPullParser.getPositionDescription();
                    throw new InflateException(positionDescription + ": No start tag found!");
                }
            } catch (IOException e2) {
                String positionDescription2 = xmlPullParser.getPositionDescription();
                String message = e2.getMessage();
                throw new InflateException(positionDescription2 + ": " + message, e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException(e3);
            }
        }
    }

    private final void g(XmlPullParser xmlPullParser, Object obj, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                }
                next = 3;
            }
            if (next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        d(obj, Intent.parseIntent(this.a.getResources(), xmlPullParser, attributeSet));
                    } else if ("extra".equals(name)) {
                        this.a.getResources().parseBundleExtra("extra", attributeSet, a(obj));
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } else {
                        Object e = e(name, attributeSet);
                        this.b.v(obj, e);
                        g(xmlPullParser, e, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }

    public abstract Bundle a(Object obj);

    public Object b(int i) {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.b = new lol();
        XmlResourceParser xml = this.a.getResources().getXml(i);
        try {
            Object f = f(xml);
            if (xml != null) {
                xml.close();
            }
            return f;
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }

    protected void c(Object obj, AttributeSet attributeSet) {
    }

    protected abstract void d(Object obj, Intent intent);
}
