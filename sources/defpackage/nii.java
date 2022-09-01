package defpackage;

/* compiled from: PG */
/* renamed from: nii  reason: default package */
/* loaded from: classes2.dex */
final class nii extends IllegalArgumentException {
    public nii(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
