package defpackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* renamed from: lbw  reason: default package */
/* loaded from: classes.dex */
public final class lbw {
    private static final jlt c = new jlt("LocalTestingConfigParser");
    public final XmlPullParser a;
    public final nrw b = lbt.a();

    public lbw(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public static lbt a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return lbt.a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                lbw lbwVar = new lbw(newPullParser);
                lbwVar.b("local-testing-config", new lbu(lbwVar, 2));
                lbt c2 = lbwVar.b.c();
                fileReader.close();
                return c2;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e) {
            c.h("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e.getMessage());
            return lbt.a;
        }
    }

    public final void b(String str, lbv lbvVar) {
        while (true) {
            int next = this.a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.a.getEventType() == 2) {
                if (this.a.getName().equals(str)) {
                    lbvVar.a();
                } else {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.a.getName()), this.a, null);
                }
            }
        }
    }
}
