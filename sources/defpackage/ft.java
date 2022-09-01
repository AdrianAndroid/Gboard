package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: ft  reason: default package */
/* loaded from: classes.dex */
public final class ft extends MenuInflater {
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public ft(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (menu instanceof wm) {
            XmlResourceParser xmlResourceParser = null;
            try {
                try {
                    xmlResourceParser = this.e.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    if (xmlResourceParser == null) {
                        return;
                    }
                    return;
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } finally {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        }
        super.inflate(i, menu);
    }
}
