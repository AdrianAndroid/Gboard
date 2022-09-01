package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: exn  reason: default package */
/* loaded from: classes.dex */
public final class exn {
    public final String a;
    public final File b;
    public final exm c;
    public final jav d;

    public exn() {
    }

    public exn(String str, File file, exm exmVar, jav javVar) {
        this.a = str;
        this.b = file;
        this.c = exmVar;
        this.d = javVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exn) {
            exn exnVar = (exn) obj;
            if (this.a.equals(exnVar.a) && this.b.equals(exnVar.b) && this.c.equals(exnVar.c) && this.d.equals(exnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String obj = this.b.toString();
        String obj2 = this.c.toString();
        String str2 = this.d.n;
        return "PersonalizationModelConfig{modelName=" + str + ", modelDir=" + obj + ", deploymentType=" + obj2 + ", locale=" + str2 + "}";
    }
}
