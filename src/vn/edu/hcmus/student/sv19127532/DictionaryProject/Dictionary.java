package vn.edu.hcmus.student.sv19127532.DictionaryProject;

/**
 * The Dictionary class is the backbone of the application.<br>
 * Supports the following operations:<br>
 * <ol>
 *     <li>
 *         Load(String filename):<br>
 *         Load into memory of this dictionary from a text file storing a row-based format of a dictionary,
 *         where each row is considered one entry, and is formatted as<br>
 *         word`def1| def2
 *         Internal: Build a backwards tree.
 *     </li>
 *     <li>
 *         Save(String filename):<br>
 *         Save to a text file in the same format as loading for future usage.
 *     </li>
 *     <li>
 *         GetHistory():<br>
 *         Get the most recent 100 entries that have been interacted with.
 *     </li>
 *     <li>
 *         Contains(String word):<br>
 *         Checks to see if the dictionary contains any entry with the given word.
 *     </li>
 *     <li>
 *         AddEntry(Entry):<br>
 *         Add an entry to the dictionary.
 *         Each Entry contains the Word and its Definitions.
 *         Internal:
 *         Updates the backwards tree accordingly.
 *     </li>
 *     <li>
 *         AddWord(Word, Definition, bool override):<br>
 *         Adds an entry to the dictionary containing the Word and Definition.
 *         If override is true, deletes all existing entries with Word.
 *         If override is false, add an entry as normal. (this is used for adding duplicates)
 *     </li>
 *     <li>
 *         RemoveEntry(Entry):<br>
 *         Removes a specified entry by updating the forwards and backwards tree.
 *     </li>
 *     <li>
 *         EditEntry(Entry, Word, Definition):<br>
 *         Edits an entry to become Word, Definition instead.
 *         Internal:
 *         Remove the entry specified. Update the forwards and backwards tree.
 *         Add a new entry to become Word, Definition.
 *     </li>
 * </ol>
 */
public class Dictionary {
    Trie forwardsTree;
    Trie backwardsTree;
}
