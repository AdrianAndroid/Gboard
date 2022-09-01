package defpackage;

import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jzo  reason: default package */
/* loaded from: classes.dex */
public final class jzo {
    final /* synthetic */ jzp a;
    private final JsonWriter b;
    private final jzt c;
    private final long d;

    public jzo(jzp jzpVar, JsonWriter jsonWriter, jzt jztVar, long j) {
        this.a = jzpVar;
        this.b = jsonWriter;
        this.c = jztVar;
        this.d = j;
    }

    public final void a(int i, String str, String str2, String str3, long j, int i2, long j2, Object[] objArr) {
        if (this.d <= 0 || SystemClock.elapsedRealtime() <= this.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.b.beginObject();
            this.b.name("ph");
            this.b.value(i != 1 ? i != 2 ? i != 3 ? "I" : "X" : "E" : "B");
            this.b.name("pid");
            this.b.value(str);
            this.b.name("tid");
            this.b.value(str2);
            this.b.name("name");
            this.b.value(str3);
            this.b.name("ts");
            this.b.value(j);
            if (i == 3) {
                this.b.name("dur");
                this.b.value(j2);
            } else if (i == 4) {
                this.b.name("s");
                this.b.value(i2 != 1 ? i2 != 2 ? i2 != 3 ? "?" : "t" : "p" : "g");
            }
            if (objArr.length > 0) {
                this.b.name("args");
                jsb jsbVar = this.a.c;
                int i3 = 0;
                if (jsbVar != null) {
                    this.b.beginObject();
                } else {
                    this.b.beginArray();
                }
                while (i3 < objArr.length) {
                    Object obj = objArr[i3];
                    if (obj != null) {
                        if (jsbVar != null) {
                            JsonWriter jsonWriter = this.b;
                            nzv nzvVar = jsc.a;
                            String[] strArr = (String[]) jsa.a.get(str3);
                            jsonWriter.name((strArr == null || i3 >= strArr.length) ? "?" : strArr[i3]);
                        }
                        if ((obj instanceof Byte) || (obj instanceof Long) || (obj instanceof Integer)) {
                            this.b.value((Number) obj);
                        } else if (obj instanceof Boolean) {
                            this.b.value(((Boolean) obj).booleanValue());
                        } else if (obj instanceof String) {
                            this.b.value((String) obj);
                        }
                    }
                    i3++;
                }
                if (jsbVar != null) {
                    this.b.endObject();
                } else {
                    this.b.endArray();
                }
            }
            this.b.endObject();
            this.c.d(0L, SystemClock.elapsedRealtime() - elapsedRealtime);
            return;
        }
        throw new IOException("Went past time budget for conversion, aborting");
    }
}
