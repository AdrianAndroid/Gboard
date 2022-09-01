package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: dnr  reason: default package */
/* loaded from: classes.dex */
public final class dnr {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/latin5/DynamicLayoutHandler");
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public dnr(Context context) {
        try {
            XmlResourceParser xml = context.getApplicationContext().getResources().getXml(R.xml.f209550_resource_name_obfuscated_res_0x7f1700ce);
            try {
                xml.next();
                while (xml.next() != 3) {
                    if (xml.getEventType() == 2 && xml.getName().equals("layout")) {
                        String attributeValue = xml.getAttributeValue(null, "id");
                        int attributeResourceValue = xml.getAttributeResourceValue(null, "keys", -1);
                        int attributeResourceValue2 = xml.getAttributeResourceValue(null, "rules", -1);
                        if (attributeValue != null && attributeResourceValue != -1 && attributeResourceValue2 != -1) {
                            this.b.put(attributeValue, Integer.valueOf(attributeResourceValue));
                            this.c.put(attributeValue, Integer.valueOf(attributeResourceValue2));
                        }
                        xml.nextTag();
                    }
                }
                if (xml == null) {
                    return;
                }
                xml.close();
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/latin5/DynamicLayoutHandler", "<init>", 'E', "DynamicLayoutHandler.java")).t("Error while reading XML layout file");
        } catch (XmlPullParserException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/latin5/DynamicLayoutHandler", "<init>", 'G', "DynamicLayoutHandler.java")).t("Error while parsing XML layout file");
        }
    }

    private static String c(XmlResourceParser xmlResourceParser) {
        if (xmlResourceParser.next() == 4) {
            String text = xmlResourceParser.getText();
            xmlResourceParser.nextTag();
            return text;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r17, defpackage.nfh r18) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnr.a(android.content.Context, nfh):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r12, defpackage.nfh r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnr.b(android.content.Context, nfh):void");
    }
}
